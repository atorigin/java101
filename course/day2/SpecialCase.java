public class SpecialCase {

    static int i = 0; // 放在 heap 記憶體
    // int i = 99; // 會錯，因為重複宣告
    static int j = i + 1;
    public static void main(String[] args) {

        // 下面雖然可以過，但是不要用這種寫法，很容易讓人誤會
        int i = 99; // 可以宣告，因為會放在 stack 記憶體

        System.out.println("i = " + i); // 會是第 8 行的 i，因為會先找到區域變數的宣告(如果兩個變數命名一樣)
        System.out.println("j =  " + j); // 結果為 1，因為是拿 line5 的執行結果

        // 下面都是 3 ~ 5 行的結果
        SpecialCase xx = new SpecialCase();
        System.out.println("xx.i = " + xx.i);
        System.out.println("xx.j = " + xx.j);

        System.out.println("SpecialCase.i = " + SpecialCase.i);
        System.out.println("SpecialCase.j = " + SpecialCase.j);
    }
}
