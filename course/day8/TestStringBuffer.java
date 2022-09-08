package course.day8;

public class TestStringBuffer {
    public static void main(String[] args) {

        // 查看 Stringbuffer sb1 和 sb2 的變化
        StringBuffer sb1 = new StringBuffer("AB");
        System.out.println("sb1 = " + sb1);

        StringBuffer sb2 = sb1.append("CD");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
        
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));

        // 分隔線
        System.out.println("==========");

        // 改成 String 與 StringBuffer 做比較
        String s1 = new String("AB");
        System.out.println("s1 =" + s1);
        
        String s2 = s1 + "CD";
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        
    }
}
