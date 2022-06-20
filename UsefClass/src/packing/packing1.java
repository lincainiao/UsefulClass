package packing;

public class packing1 {
    public static void main(String[] args) {
        int num = 10;
        //装箱：基本类型转成引用类型
        //使用Integer创建类对象
        Integer i = Integer.valueOf(num);

        //拆箱：引用类型转换为基本类型
        Integer i2 = Integer.valueOf(200);
        int n = i2.intValue();

        //自动装箱
        int age = 22;
        Integer age1 = age;//Inter age1 = Integer.valueOf(age)

        //自动拆箱
        int ii = age;//int ii = Integer.valueOf(age)
    }
}
