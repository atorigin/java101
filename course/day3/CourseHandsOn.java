public class CourseHandsOn {
    public static void main(String[] args) {
        String str = "Apple.gif";

        // �U�O���X Apple �M gif �r��L�X

        // ��X .
        int pos = str.indexOf(".");

        // �Q�� . �����ΡA�ե� subString ��k
        System.out.println(str.substring(0, pos)); // Apple
        
        System.out.println(str.substring(pos+1)); // gif
    }
}
