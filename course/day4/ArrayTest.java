public class  ArrayTest {
    
    public static void main(String[] args) {
        int [][] arrayInt = {
            {1,2},
            {3,4,5},
            {6,7,8,9,10}
        };
        
        int sum = 0;
        for(int i = 0 ; i < arrayInt.length ; i++) {
            for (int j = 0 ; j < arrayInt[i].length; j++ ) {
                sum += arrayInt[i][j];
            }
        }
        System.out.println(sum);
    }
}
