package week3.exp5;

public class BottleTest {
    public static void main(String[] args) {

        Circle cLowwer = new Circle(20);
        Ball ball = new Ball(cLowwer);

        Circle cUpper = new Circle(10);
        Pillar pillar = new Pillar(cUpper, 20);

        Bottle bottle = new Bottle(pillar, ball);

        System.out.println("上半部分体积：" + bottle.upperPart.getVolume() + "下半部分体积：" + bottle.lowerPart.getVolume()
                + "瓶子的体积是：" + bottle.getVolume());
    }
}
