package String_;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "this is a text";
        //将字符串分割为字符串数组
        String[] sA = str.split("[ ]");
        for (int i = 0; i < sA.length; i++) {
            System.out.println(sA[i]);
        }
        //替换单词
        System.out.println(str.replace("text","pracitce"));
        System.out.println(str.replace("text","easy text"));
        for (int i = 0; i < sA.length; i++) {
            //把第一个字符转成大写
            char c = Character.toUpperCase(sA[i].charAt(0));
            //subString()截取字符串
            sA[i] = c+sA[i].substring(1);
            System.out.print(sA[i]);
        }
        System.out.println();
    }
}
