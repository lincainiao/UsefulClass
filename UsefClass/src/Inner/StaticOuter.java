package Inner;

public class StaticOuter {
    private String name = "name";
    private int num = 1000;

    //静态内部类，级别和外部类相同
    static class StaticInner {
        private String address = "address";
        private int phone = 10086;
        //静态成员
        private static int count = 10;

        //调用外部类的属性
        public void showOuter(){
            //创建外部类对象
            StaticOuter si = new StaticOuter();
            //调用外部类的方法
            System.out.println("outer's name is "+si.name);
            System.out.println("outer's num is "+si.num);
            //调用静态内部类的静态属性
            System.out.println(StaticInner.count);
        }
    }
}
