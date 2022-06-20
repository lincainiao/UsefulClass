package Calendar;

import javax.xml.crypto.Data;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        //创建Calendar对象，构造方法为protected，不能直接new
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());
        //获取时间信息
        int year = calendar.getWeekYear();
        System.out.println("年 : "+year);
        System.out.println("月 : "+calendar.get(Calendar.MONTH)+1);//从0开始，0-11
        System.out.println("日 : "+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时（12小时制） : "+calendar.get(Calendar.HOUR));//12小时制
        System.out.println("时（24小时制） : "+calendar.get(Calendar.HOUR_OF_DAY));//24小时制
        System.out.println("分 : "+calendar.get(Calendar.MINUTE));
        System.out.println("秒 : "+calendar.get(Calendar.SECOND));
        //修改时间
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.DAY_OF_MONTH,5);//修改天数，改为第五天
        System.out.println(c2.getTime().toLocaleString());
        //add方法修改时间
        Calendar c3 = Calendar.getInstance();
        c3.add(Calendar.HOUR_OF_DAY,2);
        System.out.println(c3.getTime().toLocaleString());
        //获取最值
        Calendar c4 = Calendar.getInstance();
        System.out.println(calendar.getActualMaximum(Calendar.MONTH)+1);
    }
}
