public class FollowTeacher {

    // 編譯失敗
    // int i;
    // int j = i + 1;
    
    // 編譯 OK
    static int i ;
    static int j = i + 1;
    public static void main(String[] args) {

        // method 內區域變數沒有給定初始值， j 調用 i 時會出錯
        // int i ;
        // int j = i + 1;

        // int i = 0;
        // int j = i + 1;
        System.out.println("i = " + i); // 若搭配 4,5 行，編譯會出錯，因為 static 方法呼叫執行時期的實體變數
        System.out.println("j = " + j); // 若搭配 4,5 行，編譯會出錯，因為 static 方法呼叫執行時期的實體變數

        // 用 HelloWorld 來 new 一個實體 (用 instance 呼叫)
        FollowTeacher xx = new FollowTeacher();
        System.out.println("xx.i = " + xx.i);
        System.out.println("xx.j = " + xx.j);

        // 根本不用生成實體 (用 class 呼叫)
        System.out.println("FollowTeacher.i" + FollowTeacher.i);
        System.out.println("FollowTeacher.j" + FollowTeacher.j);
    }
}
