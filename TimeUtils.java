    
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeUtil {
    //private static final String DATE_FORMAT_1 = "dd MMMM yyyy";
    private static final String DATE_FORMAT_1 = "yyyy年MM月dd日";
    private static final String DATE_FORMAT_2 = "yyyy年MM月dd日HH : mm";

    public static long date2long(String dateString) { //将字符串类型转成long类型  年月日
        try {
            //月份那用了中文，这里边便改成简体中文,原：Locale.ENGLISH
            Date date = new SimpleDateFormat(DATE_FORMAT_1, Locale.getDefault()).parse(dateString);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static long dateTime2long(String dateString) { //将字符串类型转成long类型  年月日时分
        try {
            //月份那用了中文，这里边便改成简体中文,原：Locale.ENGLISH
            Date date = new SimpleDateFormat(DATE_FORMAT_2, Locale.getDefault()).parse(dateString);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String long2dateTime(long time) { //将long类型格式化成字符类型  年月日时分
        Date date = new Date(time);
        DateFormat format = new SimpleDateFormat(DATE_FORMAT_2, Locale.getDefault());
        format.setTimeZone(TimeZone.getDefault());
        return format.format(date);
    }
    public static int[] getCurrentDateTime() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int datetime[] = {year,month,day,hour,minute,second};
        return datetime;
    }
    
        public static String getPhotoName(){
        String photoName="";
        int datatime[] = getCurrentDateTime();
        photoName = datatime[0]+"-"+datatime[1]+"-"+datatime[2]+"_"+
                (datatime[3]*60*60+datatime[4]*60+datatime[5]);
        return photoName;
    }
}
