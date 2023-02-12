package books.singleton.section3;


// 懶漢模式 lazy initialization 考慮多執行緒
public class Sun {
    // declare sun instance variable , not initialization
    private static Sun sun;

    // constuctor
    private Sun() {}

    // allow access sun instance from other class
    public static Sun getInstance() {
        if(sun == null) {
            synchronized(Sun.class) { // locking the block to avoid multi-thread want getInstance on same time
                if(sun == null) { // double-check locking 雙重鎖
                    sun = new Sun();
                }
            }
        }
        return sun;
    }
    public static void main(String[] args) {
        Sun mySun = Sun.getInstance();
        Sun mySun2 = Sun.getInstance();

        if(mySun.equals(mySun2)) {
            System.out.println("Same sun!");
        }
    }
}
