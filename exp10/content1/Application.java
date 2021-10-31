package exp10.content1;

public class Application {
    public static void main(String[] args) {
        // 底制造者
        BottomCreator bottomCreator = new CircleBottomCreator();
        GeometryBottom bottom = bottomCreator.getBottom(20);// 制造一个半径为20的圆底
        Pillar pillar = new Pillar(bottom, 50);
        System.out.println(pillar + "的体积：" + pillar.getVolume());

        System.out.println("==============");
        bottomCreator = new RectangleBottomCreator();
        bottom = bottomCreator.getBottom(5, 4); // 制造一个长为5，宽为4的矩形底
        pillar = new Pillar(bottom, 50);
        System.out.println(pillar + "的体积：" + pillar.getVolume());

        System.out.println("==============");
        bottomCreator = new TriangleBottomCreator();
        bottom = bottomCreator.getBottom(4, 6); // 制造一个底边为4，高为6的矩形底
        pillar = new Pillar(bottom, 50);
        System.out.println(pillar + "的体积：" + pillar.getVolume());
    }
}
