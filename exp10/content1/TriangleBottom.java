package exp10.content1;

public class TriangleBottom extends GeometryBottom {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public TriangleBottom(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return "底边为" + base + "、高为" + height + "的三角形";
    }

}
