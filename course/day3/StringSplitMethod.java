public class StringSplitMethod {
    public static void main(String[] args) {
        String str = "That-is-a-pen";
        String[] arrStr = str.split("[-]+");

        for (int i =0 ; i < arrStr.length ; i++ ) {
            System.out.println(arrStr[i]);
        }

        // 分隔線
        System.out.println("=====================================");
        
        // 不管 str 的 - 符號有多少都不影響輸出
        String str1 = "That------------is-----a-pen";
        String[] arrStr1 = str1.split("[-]+"); // + 代表任意多個，這邊就是任意多個 - 符號

        for (int i = 0; i < arrStr1.length; i++) {
            System.out.println(arrStr1[i]);
        }
    }
}
