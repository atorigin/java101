package books.singleton.section2;

// 懶漢模式
public class Sun {
    private static Sun sun; // 不進行 instance 化 , 移除 final , final 的常量必須在宣告的同時初始化

    // constuctor
    private Sun() {
        System.out.println("hello sun!");
    }

    // 全域訪問點
    public static Sun getInstance() {
        if(sun == null){
            sun = new Sun();
        }
        return sun;
    }

    public static void main(String[] args) {
        Sun mySun = Sun.getInstance();
        Sun mySun2 = Sun.getInstance();

        if(mySun.equals(mySun2)){
            System.out.println("Same Sun!");
        }
    }
}
