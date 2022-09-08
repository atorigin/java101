package course.day8;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendar_TIme_Week {
    // 生成 GregorianCalendar
    // 利用方法找出 2030 年元旦是星期幾
    static String[] dayOfWeek = {"日","一","二","三","四","五","六"};

    public static void main(String[] args) {
        
        Calendar cal = new GregorianCalendar(2030,Calendar.JANUARY,1,0,0,0);
        System.out.println("星期" + dayOfWeek[cal.get(Calendar.DAY_OF_WEEK) - 1]);

        System.out.println("==========");

        // 透過 Calendar 印出當前時間
        Calendar rightNow = new GregorianCalendar(TimeZone.getTimeZone("Asia/Taipei"));
        System.out.println(rightNow.getTime());
        int year = rightNow.get(Calendar.YEAR);
        int month = rightNow.get(Calendar.MONTH) + 1; // +1 是因為陣列關係從 0 開始算，例如 1 月是 0，二月是 1 ....
        int day = rightNow.get(Calendar.DAY_OF_MONTH);
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        int min = rightNow.get(Calendar.MINUTE);
        int sec = rightNow.get(Calendar.SECOND);
        System.out.println(year + "年" + month + "月" + day + "號" + hour + "點" + min + "分" + sec + "秒");

        // 若要查 TimeZone 有哪些 ID 可用
        // for(int i=0 ; i < TimeZone.getAvailableIDs().length; i++) {
        //    System.out.println(TimeZone.getAvailableIDs()[i]);
        // }

    }
    
}
