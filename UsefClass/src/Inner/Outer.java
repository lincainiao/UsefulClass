package Inner;

public class Outer {
    private int iOuter;
    private String name;
    //构造函数
    public Outer(){
        this.iOuter = 100;
        this.name = "outer";
    }

    public int getiOuter() {
        return iOuter;
    }

    public String getName() {
        return name;
    }

    //内部类，不能定义静态成员
    class Inner{
        //和外部类相同名的变量
        private String name;
        //构造函数
        public Inner(){
            this.name = "inner";
        }
        public void getOuterI(){
            //内部类能访问外部的私有变量
            System.out.println(iOuter);
        }
        public String getName(){
            return name;
        }
        //通过内部类得到外部类的相同名字变量（name）
        public String getOuterName(){
            //外部类名字.this.(相同名字变量)
            return Outer.this.name;
        }
    }
}
