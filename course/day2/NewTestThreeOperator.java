public class NewTestThreeOperator {
    public static void main(String[] args) {
        // 有 350 平方公尺的地，一罐油漆可以塗 200 平方公尺，試問總共要買幾罐油漆?
        int  area = 350, coverage = 0, count = 0;

        if (coverage > 0 && area > 0 ){
            count = area / coverage;
        }

        // 如果 area 與 coverage 取餘數剛好 = 0 則整除，無須多買一罐油漆，反之，則須多買一罐油漆
        if(area > 0 && coverage > 0 && area % coverage > 0) {
            count++;
        }
        
        // 油漆數量大於一罐則印複數，等於一罐印單數。小於一罐印不需要買
        if(count > 1) {
            System.out.println("Need " + count + " cans");
        } else if (count == 1) {
            System.out.println("Need " + count + " can");
        } else {
            System.out.println("Something's wrong");
        }
    }
}
