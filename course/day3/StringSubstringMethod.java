public class StringSubstringMethod {
    public static void main(String[] args) {
        //測試 String substring(int beginIndex) , substring(int beginIndex, int endIndex) 
        String s1 = "0123456789我是誰";

        String s2 = s1.substring(6);
        System.out.println(s2);          //6789我是誰
        
        String s3 = s1.substring(6,9);
        System.out.println(s3);          //678
    
        String s4 = s1.substring(9,10);
        System.out.println(s4);          //9
        
        String s5 = s1.substring(9,11);  //9我
        System.out.println(s5);
    }
}
