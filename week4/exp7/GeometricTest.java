package week4.exp7;

public class GeometricTest {
    public static void main(String[] args) {
        Geometric geometric = new Circle("红色", true, 2);
        System.out.println(geometric.toString());
        System.out.println("===========");
        geometric = new Rectangle("蓝色", false, 5, 7);
        System.out.println(geometric.toString());
    }
}
