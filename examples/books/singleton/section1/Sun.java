package books.singleton.section1;

// 單例模式 - 懶漢模式
// 透過單一、統一的存取介面，使整個系統達到保持協調一致的特性
public class Sun {
    // 宣告 static final 在 application initialization 時就生成這個 instance , 並在整個 context 這有一個 sun object    
    private static final Sun sun = new Sun();

    // 私有的 constuctor
    private Sun() {
        System.out.println("hello sun!");
    }

    // 開放外部可以透過 getInstance() 取得這個全局裡唯一的 sun
    // 不管別人怎麼取，永遠都返回最上面那個 sun instance (記憶體裡同一個位置)
    // 就像太陽一樣，整個太陽系中，不管誰看到太陽，都是同一個太陽，不會有不同人看到不同的太陽的情況
    public static Sun getInstance() {
        return sun;
    }

    public static void main(String[] args) {
        // 取得 sun
        Sun mySun = Sun.getInstance();
        Sun mySun2 = Sun.getInstance();
        // 藉由這種方式可以檢查兩個 sun 都是同一個記憶體位置
        if(mySun.equals(mySun2)) {
            System.out.println("Same instance!");
        }
        // 結果只會有一次 hello sun! , 因為 sun 初始化一次之後，就永遠存在於整個程式中了，他不會有第二次初始化的機會
        // 不管呼叫 getInstance 幾次都是一樣的結果

    }
}

