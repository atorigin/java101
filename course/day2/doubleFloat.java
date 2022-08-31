public class doubleFloat {

    // 展示浮點數其實是有偏差的
    public static void main(String[] args) {
        float fValue = 0.0f;
        for(int i = 0 ; i < 10 ; i++ ) {
            fValue += 0.1;
            System.out.println(fValue);
        }
    }
}
