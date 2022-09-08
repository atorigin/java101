package exercise.thread02;

public class TicketBuy implements Runnable{
    
    private int ticketNums = 10;

    @Override
    public void run() {
        for (int i = 0; i < ticketNums; i++) {
            System.out.println(Thread.currentThread().getName() + "搶到了" + i + "的票");
        }
    }

    public static void main(String[] args) {
        // Create instance
        TicketBuy t = new TicketBuy();

        // 多線程執行
        new Thread(t,"t1").start();
        new Thread(t,"t2").start();
        new Thread(t,"t3").start();
        new Thread(t,"t4").start();
    }
}