package exp8.content4;

public class Mouse implements USB {

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    public void click() {
        System.out.println("鼠标点击");
    }
}
