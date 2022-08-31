package course.day3_homework;

public class HelloWorldGraphics2 {
    
    public static void main(String[] args) {
        
        // 抽出來
        int count = 30;

        for (int i = 1 ; i <= count ; i++) {
            /*
             *     *
             * 
             *    ***
             * 
             *   *****
             * 
             * *********
             */
            
             // 如果 i 是偶數都不成立
             if (i % 2 != 0) {
                // 印星星
                for (int j = 1 ; j <= count ; j++) {
                    // i = 1 j = 5
                    if (j > (count-i) / 2 && j <= (count+i)/2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
            
    }
}