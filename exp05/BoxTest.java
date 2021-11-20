package exp05;

import java.util.Scanner;

public class BoxTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 正方体
        System.out.println("请输入正方体的边长：");
        Box box1 = new Box(sc.nextFloat());
        System.out.println("正方体的体积是：" + box1.getVolume());

        // 长方体
        System.out.println("请输入长方体的长，宽，高：");
        Box box2 = new Box(sc.nextFloat(), sc.nextFloat(), sc.nextFloat());

        System.out.println("长是" + box2.getLength() + "，宽是" + box2.getWidth() + "，高是" + box2.getHeight() + "的盒子的体积是"
                + box2.getVolume());
        sc.close();
    }
}
