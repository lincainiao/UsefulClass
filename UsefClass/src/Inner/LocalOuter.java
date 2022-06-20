package Inner;
// 局部内部类
public class LocalOuter {
    private String nameOut = "outer";
    private int numOut = 1000;

    public void show(){
        //局部变量
        final String name = "lingl";
        //局部内部类：不能加任何访问修饰符
        class Inner{
            //局部内部类的属性
            private String nameIn = "inner";
            private int numIn = 100;
            //局部内部类方法
            public void showIn(){
                //可以直接访问外部类的属性
                System.out.println("outer name is "+nameOut);
                System.out.println("outer num is "+numOut);
                //访问内部类的属性
                System.out.println("inner name is "+nameIn);
                System.out.println("inner num is "+numIn);
                //在局部内部类中访问外部类方法的局部变量
                //在jdk1.7时，需要是常量，jdk1.8之后不需要
                System.out.println(name);
            }
        }

        //创建内部类对象
        Inner inner = new Inner();
        inner.showIn();
    }

}
