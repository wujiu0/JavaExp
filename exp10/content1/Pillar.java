package exp10.content1;

public class Pillar {
    private GeometryBottom bottom;
    private double height;

    public Pillar(GeometryBottom bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolume() {
        return bottom.getArea() * height;
    }

    @Override
    public String toString() {
        return "底是" + bottom + "，高为" + height + "的柱体";
    }
}
