package Object_;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = p1;
        //getClass()
        System.out.println(p1.getClass() == p2.getClass());

        //hashCode()
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        //toString
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //equals
        //System.out.println(p1.equals(p2));
        //System.out.println(p1.equals(p3));
        //重写equals方法，判断某个变量是否相等
        System.out.println(p1.equals(p2));

    }
}
