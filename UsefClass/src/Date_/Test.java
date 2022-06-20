package Date_;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //创建Date对象
        Date d1 = new Date();
        Date date = d1;
        System.out.println("today : "+d1.toString());
        System.out.println("today : "+d1.toLocaleString());
        //昨天
        Date d2 = new Date(d1.getTime()-24*60*60*1000);//减去一天的毫秒数
        System.out.println("yesterday : "+d2.toLocaleString());
        //明天
        Date d3 = new Date(d1.getTime()+60*60*24*1000);
        System.out.println("tomorrow : "+d3.toLocaleString());
        //after\before
        System.out.println(d1.before(d2));
        System.out.println(d1.after(d2));
        //比较，比较毫秒值，
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.compareTo(d3));
        System.out.println(d1.compareTo(date));
        //比较是否相等
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(date));
    }
}
