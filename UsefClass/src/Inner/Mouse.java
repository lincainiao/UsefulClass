package Inner;

//实现接口
public class Mouse implements Usb {
    //实现接口的方法
    @Override
    public void service() {
        System.out.println("Mouse is connected!");
    }
}
