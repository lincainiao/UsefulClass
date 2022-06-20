package String_;

import java.util.Arrays;
import java.util.Locale;

public class Demo01 {
    public static void main(String[] args) {
        String s1 = "hello";//字符串存在于方法区的字符串池中
        s1 = "zhangsan";//对s1重新赋值，在字符串池中重新开辟新的空间，而原来的值仍然在字符串池中
        String s2 = "zhangsan";//共享字符串池的同一个"zhangsan"

        //引用类型创建字符串
        String str = new String("hello world");

        //字符串方法使用
        //length
        System.out.println("str's length is "+str.length());
        //返回某个位置的字符，下标从0开始
        System.out.println("the 5th char of str is "+str.charAt(4));
        //是否包含子字符串
        System.out.println(str+"is content \"hello\" ? "+str.contains("hello"));
        //将字符串转成字符数组
        System.out.println(Arrays.toString(str.toCharArray()));
        //查找子字符串首次出现的下标，存在则返回下标；不存在则返回-1
        System.out.println("\"l\" for the first time is "+str.indexOf("l"));
        //查找字符串在当前字符串中最后一次出现的下标
        System.out.println("\"l\" for the last time is "+str.lastIndexOf("l"));
        //去掉字符串前后的空格
        //System.out.println(str.trim());
        //将小写转成大写
        System.out.println(str.toUpperCase());
        //将大写转成小写
        System.out.println(str.toLowerCase());
        //判断知否以某字符串开头/结尾
        System.out.println("str is endwith \"ld\"? "+str.endsWith("ld"));
        System.out.println("str is startwith \"hello\"? "+str.startsWith("helo"));
        //替换字符串
        System.out.println(str.replace("hello","hi"));
        System.out.println(str.replace("hi","hello"));
        //根据字符串拆分
        String strs = "my name   is lin,gl";
        String[] strings = strs.split(" ");
        System.out.print("use \" \" to spilt is: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }
        System.out.println();
        //用多个字符拆分
        strings = strs.split("[ ,]");
        System.out.print("use \" \" and \",\" to spilt is: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }
        System.out.println();
        //拆分的字符后面带上"+"号，表示连续的看做一个
        strings = strs.split("[ ,]+");
        System.out.print("use \" \" and \",\" to spilt is: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]+" ");
        }
        System.out.println();
        //比较是否相等用equals(忽略大小写)，比较大小用compare
        System.out.println("abc".compareTo("xyz"));//a:97;x:120
        System.out.println("abc".compareTo("abcdefg"));//比长度
    }
}
