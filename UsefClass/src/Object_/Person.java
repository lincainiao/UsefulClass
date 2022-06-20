package Object_;

public class Person {
    private String name;
    private int age;
    private char sex;
    //无参构造
    public Person(){
        this.name = "lingl";
        this.age = 20;
        this.sex = 'm';
    }
    //有参构造
    public Person(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //重写toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
    //重写equals方法
    @Override
    public boolean equals(Object o) {
        //判断两个对象是否是同一个
        if (this == o) return true;
        //判断是否为null，判断是否为同一个类型
        if (o == null || getClass() != o.getClass()) return false;
        //强制类型转换
        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
