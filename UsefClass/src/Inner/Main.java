package Inner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
//        //成员内部类
//        m.getOuter();

//        //静态内部类
//        m.getStatic();

//        //局部内部类
//        m.getLocal();

        //匿名内部类
        m.getAnony();

        int i = 10;
    }

    //成员内部类
    public void getOuter(){
        //创建外部类
        Outer outer = new Outer();
        //通过外部类创建成员内部类
        Outer.Inner inner = outer.new Inner();
        //内部类能访问外部类的属性
        System.out.print("outer i is ");
        inner.getOuterI();
        //内部类和外部类相同的属性，内部类优先访问内部类的
        System.out.print("name is shared, this name is "+inner.getName());
        System.out.println();
        //内部类获取外部类相同名称的属性
        System.out.print("name is shared, this name is "+inner.getOuterName());
    }

    //静态内部类
    public void getStatic(){
        //创建静态内部类
        StaticOuter.StaticInner inner = new StaticOuter.StaticInner();
        //通过内部静态类获取外部类属性
        inner.showOuter();
    }

    //局部内部类
    public void getLocal(){
        LocalOuter localOuter = new LocalOuter();
        //不能直接创建局部内部类，需要在外部类的方法中创建内部类
        localOuter.show();
    }

    //匿名内部类
    public void getAnony(){
        //创建接口类型的变量
        Usb usb = new Mouse();
        usb.service();

        //匿名内部类，接口不能直接实例化，要实现方法，相当于局部内部类
        Usb u = new Usb() {
            @Override
            public void service() {
                System.out.println("this is anony!");
            }
        };
        u.service();
    }
}
