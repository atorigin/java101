package course.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromKeyboard1A {
    public static void main(String[] args) {

        try {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            while (true) {

                System.out.print("請輸入你的半徑> ");

                String data = br.readLine();

                if ("exit".equals(data)) {
                    System.out.println("已結束輸入!");
                    break;
                }

                System.out.println("你剛輸入的半徑:" + "[" + data + "]");

                /**********************以下以求圓形面積為「輸入應用示範」**********************/				
                double radius;
                try {
                    radius = Double.valueOf(data).doubleValue();
                } catch (NumberFormatException nfe) {
                    System.out.println("資料格式不正確!\n");
                    continue;
                }

                if (radius <= 0) {
                    System.out.println("半徑必須是正值!\n");
                    continue;
                }

                double area = Math.PI * radius * radius;
                System.out.println("得到的圓形面積:" + "[" + area + "]\n");
                /*********************************************************************/	
            
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
