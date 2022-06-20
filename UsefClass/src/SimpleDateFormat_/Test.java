package SimpleDateFormat_;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception{
        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //创建Date对象
        Date date = new Date();
        //格式化date
        String str = sdf.format(date);
        String time = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(str);
        System.out.println(time);

        //字符串解析为日期，格式要和SimpleDateFormat相同
        Date date1 = sdf.parse("2022-01-25");
        System.out.println(date1);
    }
}
