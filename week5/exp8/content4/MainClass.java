package week5.exp8.content4;

public class MainClass {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.powerOn();

        // 创建一个USB鼠标
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        // 创建一个usb键盘
        Keyboard keyboard = new Keyboard();// 没有使用多态写法
        // 方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
