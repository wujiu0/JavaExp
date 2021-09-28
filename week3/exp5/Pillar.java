package week3.exp5;

public class Pillar {
    Circle bottom;
    private float height;

    public Pillar(Circle bottom, float height) {
        this.bottom = bottom;
        this.height = height;
    }

    public double getVolumn() {

        return bottom.getArea() * height;
    }
}
