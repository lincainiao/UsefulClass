package BigDecimal_;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.System.*;

/**
 * double存的是近似值
 * BigDecimal是精确值
 */
public class Test {
    public static void main(String[] args) {
        double d1 = 1.0;
        double d2 = 0.9;
//        System.out.println(d1-d2);//0.09999999999999998
        double result = (1.4-0.5)/0.9;
//        System.out.println(result);//0.9999999999999999

        //传入字符串，自动转成数字
        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("0.9");
        //不能直接使用运算符
        //subtract：减法
        out.println(b1.subtract(b2));
        //add加法
        out.println(b1.add(b2));
        //multiply乘法
        out.println(b1.multiply(b2));
        //除法divide
        out.println(new BigDecimal("1.4").subtract(new BigDecimal("0.5")).divide(new BigDecimal("0.9")));
        //除不尽汇报异常，需要说明保留几位小数
        out.println(new BigDecimal("10").divide(new BigDecimal("3"), 5, RoundingMode.HALF_UP));
    }
}
