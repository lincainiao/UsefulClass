package System_;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
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

    @Override
    protected void finalize() throws Throwable{
        System.out.println(this .name+"回收完成!");
    }
}
