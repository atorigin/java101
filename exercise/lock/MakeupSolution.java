package exercise.lock;

// 口紅
class Lipstick {
    
}
// 鏡子
class Mirror {

}

public class MakeupSolution extends Thread {
    private int choice;
    private String name;

    static Lipstick g1 = new Lipstick();
    static Mirror g2 = new Mirror();

    // 建構子
    public MakeupSolution(int choice , String name) {
        this.choice = choice;
        this.name = name;
    }

    @Override
    public void run() {
        doMakeup();
    }

    public void doMakeup(){
        if(choice == 0) {
            synchronized(g1) {
                System.out.println(name + "拿到了口紅");
            }
            // 會把口紅釋放掉才拿鏡子
            synchronized(g2) {
                System.out.println(name + "拿到了鏡子");
            }
            System.out.println(name + "開始化妝");
        } else {
            synchronized(g2) {
                System.out.println(name + "拿到了鏡子");
            }

            // 會把鏡子釋放掉才拿口紅
            synchronized(g1) {
                System.out.println(name + "拿到了口紅");
            }
            System.out.println(name + "開始化妝");
        }
    }
    
    public static void main(String[] args) {
        MakeupSolution role1 = new MakeupSolution(0, "灰姑娘");
        MakeupSolution role2 = new MakeupSolution(1, "白雪公主");
        
        role1.start();
        role2.start();

        // 不會互搶口紅及鏡子物件，因此可以化妝
    }
}
