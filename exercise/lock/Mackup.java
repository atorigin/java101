package exercise.lock;

// 口紅
class Lipstick {
    
}
// 鏡子
class Mirror {

}

public class Mackup extends Thread {
    private int choice;
    private String name;

    static Lipstick g1 = new Lipstick();
    static Mirror g2 = new Mirror();

    // 建構子
    public Mackup(int choice , String name) {
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
                synchronized(g2) {
                    System.out.println(name + "拿到了鏡子");
                }
            }
            System.out.println(name + "開始化妝");
        } else {
            synchronized(g2) {
                System.out.println(name + "拿到了鏡子");
                synchronized(g1) {
                    System.out.println(name + "拿到了口紅");
                }
            }
            System.out.println(name + "開始化妝");
        }
    }
    
    public static void main(String[] args) {
        Mackup role1 = new Mackup(0, "灰姑娘");
        Mackup role2 = new Mackup(1, "白雪公主");
        
        role1.start();
        role2.start();

        // 會發現永遠沒人可以開始化妝
    }
}
