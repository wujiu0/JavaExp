package week3.exp5;

public class Circle {
    private float r;

    public Circle(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}
