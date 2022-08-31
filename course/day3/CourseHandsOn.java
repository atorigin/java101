public class CourseHandsOn {
    public static void main(String[] args) {
        String str = "Apple.gif";

        // 各別取出 Apple 和 gif 字串印出

        // 找出 .
        int pos = str.indexOf(".");

        // 利用 . 做切割，調用 subString 方法
        System.out.println(str.substring(0, pos)); // Apple
        
        System.out.println(str.substring(pos+1)); // gif
    }
}
