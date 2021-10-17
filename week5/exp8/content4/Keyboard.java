package week5.exp8.content4;

//键盘是一个USB设备
public class Keyboard implements USB {

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    public void type() {
        System.out.println("键盘输入");
    }
}
