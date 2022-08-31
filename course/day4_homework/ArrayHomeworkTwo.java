public class ArrayHomeworkTwo {
    public static void main(String[] args) {
        int x[][] = new int[3][3];
        int y[][] = new int[3][3];
        int z[][] = new int[3][3];

        // random generator numbers into x and y
        for (int i = 0 ; i < x.length ; i++) {
            for (int j = 0 ; j < x[i].length ; j++) {
                x[i][j] = (int) (Math.random() * 30);
                y[i][j] = (int) (Math.random() * 30);
                z[i][j] = x[i][j] + y[i][j];

                System.out.println("-----z的二維陣列為兩者相加-----");
                // print
                System.out.println("x[" + i +"][" + j + "] 等於 " + x[i][j]);
                System.out.println("y[" + i +"][" + j + "] 等於 " + y[i][j]);

                // 兩者相加的 z
                System.out.println("z[" + i +"][" + j + "] 等於 " + z[i][j]);
            }
        }
    }
}