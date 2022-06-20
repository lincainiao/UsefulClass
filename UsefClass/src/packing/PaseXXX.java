package packing;

import java.util.function.IntToDoubleFunction;

public class PaseXXX {
    public static void main(String[] args) {
        int i = 10;
        //基本类型转换为字符串
        //+
        String is1 = i+"";
        //toString
        String is2 = Integer.toString(i);
        //toString:radix(进制)
        String s3 = Integer.toString(i,16);
        System.out.println(s3);

        //字符串转换为基本类型
        String s = "10";
        //使用Integer的方法
        int si1 = Integer.parseInt(s);//传入的字符串不能有非数字

        //boolean字符串转成字符类型,"true"-->true,非"true"-->false
        String s2 = "trues";
        boolean flag = Boolean.parseBoolean(s2);
        System.out.println(flag);

    }
}
