package course.day8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) {
//              只要能取得 long 的毫秒數，就能轉換取出各種時間


//              java.util.Date du = new java.util.Date();
//              System.out.println("java.util.Date() = "+ du);
//              long long1 = du.getTime(); 

//              這邊有提到一個取當前時間毫秒的另一個方法，用 System 類別
//              long long1 = System.currentTimeMillis();

                Calendar cal = new GregorianCalendar(2022, Calendar.JANUARY, 1, 0, 0, 0); // 這邊用到多型
                java.util.Date du = cal.getTime();
                System.out.println("java.util.Date() = "+ du);
                long long1 = du.getTime(); 
                
                System.out.println("long1  = "+ long1);
                
                // 注意 java.sql 的 Date 才是資料庫相關的格式
                java.sql.Date ds = new java.sql.Date(long1);
                System.out.println("java.sql.Date()       = "+ ds);
                
                java.sql.Time t = new java.sql.Time(long1);
                System.out.println("java.sql.Time()       = "+ t);
                
                java.sql.Timestamp ts = new java.sql.Timestamp(long1);
                System.out.println("java.sql.Timestamp()  = "+ ts);
    }
}
