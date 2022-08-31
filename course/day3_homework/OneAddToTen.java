package course.day3_homework;

public class OneAddToTen {
    public static void main(String[] args) {
        // 比較三種迴圈從 1 加到 10 的結果

        // for
        int forI = 0;
        for (int i = 1 ; i <= 10 ; i++)
            forI += i;
        System.out.println(forI);    
        System.out.println("----------");

        // while
        int whileI = 0;
        int i = 0;
        while (i <= 10) {
            whileI += i;
            i++;
        }
        System.out.println(whileI);
        System.out.println("----------");

        // do-while
        int doJ = 0;
        int j = 0;
        do {
            doJ += j;
            j++;
        } while (j <= 10);
        System.out.println(doJ);
    }
}