
public class ArrayHomeworkOne {
    public static void main(String[] args) {
        int x[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int y[][] = {
            {10,11,12},
            {13,14,15},
            {16,17,18}
        };

        int z[][] = new int[3][3];

        for(int i = 0; i < x.length ; i ++) {
            for (int j = 0 ; j < x[i].length ; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }

        System.out.println(z[1][0]);
    }
}