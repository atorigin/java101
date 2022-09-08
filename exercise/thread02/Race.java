package exercise.thread02;

public class Race implements Runnable{
    private static String winner;
    
    @Override
    public void run() {
        
        // 一百步的賽道
        for (int i = 1; i <= 100; i++) {
            // 模擬兔子休息
            if (Thread.currentThread().getName().equals("兔子") && i%10==0) {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            // 調用 gameOver 方法判斷比賽是否結束
            boolean result = gameOver(i);
            if (result) {
                break;
            }

            // 執行跑步
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }
    }

    // 傳入走的步數
    private boolean gameOver(int steps) {
        // 如果 winner 不為空返回 true，如果 steps == 100 返回 true，其他結果返回 false

        if (winner != null) {
            return true;
        } {
            if (steps == 100) {
                winner = Thread.currentThread().getName();
                System.out.println("優勝者: " + winner);
                return true;
            }
        }

        return false;
    }

    // 主程式，開啟兩條線程模擬 100 步跑道比賽，一個為兔子，一個為烏龜
    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race, "兔子").start();
        new Thread(race, "烏龜").start();
    }
    
}
