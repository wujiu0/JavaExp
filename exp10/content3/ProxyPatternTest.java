package exp10.content3;

/**
 * 代理模式
 * 
 * 创建一个 Image 接口和实现了 Image 接口的实体类。ProxyImage 是一个代理类，减少 RealImage 对象加载的内存占用。
 * ProxyPatternDemo 类使用 ProxyImage 来获取要加载的 Image 对象，并按照需求进行显示。
 */
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("hello.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
