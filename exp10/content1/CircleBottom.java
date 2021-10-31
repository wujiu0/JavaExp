package exp10.content1;

public class CircleBottom extends GeometryBottom {
    private double radius;

    public CircleBottom(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "半径是" + radius + "的圆";
    }
}
