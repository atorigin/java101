package course.day3_homework;

public class TestLoop {
    public static void main(String[] args) {
        // ®i¥Ü while / do-while ¯S©Ê
        int i = 100;
        
        // while 
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("-----");

        // do-while
        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        System.out.println("-----");

        // count++
        int count = 1;

        while (count++ < 5) {
            System.out.println(count);
        }
    }
}