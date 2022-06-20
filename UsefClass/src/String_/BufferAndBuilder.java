package String_;

import Inner.StaticOuter;

import java.util.Date;

/**
 * stringBuffer可变长字符串，运行效率慢，线程安全
 * stringBuilder可变长字符串，运行效率快，线程不安全
 * 上述两者都比string效率快，节省内存，功能相同
 */
public class BufferAndBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //追加append
        stringBuilder.append("my name is ");
        System.out.println(stringBuilder);
        stringBuilder.append(5);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString());
        //insert();添加，可以在某个位置添加
        stringBuilder.insert(0,"hello ");
        System.out.println(stringBuilder.toString());
        //replace:替换（可以指定位置）
        stringBuilder.replace(0,6,"just ");
        System.out.println(stringBuilder.toString());
        //delete:删除
        stringBuilder.delete(0,5);
        System.out.println(stringBuilder.toString());
        System.out.println();
    }
}
