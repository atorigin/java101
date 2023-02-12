package books.singleton.section3;


// 懶漢模式 lazy initialization 考慮多執行緒
public class Sun {
    // declare sun instance variable , not initialization
    private static Sun sun;

    // constuctor
    private Sun() {}

    // allow access sun instance from other class
    public Sun getInstance() {
        if(sun == null) {
            synchronized(Sun.class) { // locking the block to avoid multi-thread want getInstance on same time
                if(sun == null) { // double-check locking 雙重鎖
                    sun = new Sun();
                }
            }
        }
        return sun;
    }
}
