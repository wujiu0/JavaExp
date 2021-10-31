package exp10.content1;

public class RectangleBottom extends GeometryBottom {
    private double length;
    private double width;

    public RectangleBottom(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "长为" + length + "、宽为" + width + "的矩形";
    }
}
