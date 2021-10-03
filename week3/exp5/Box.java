package week3.exp5;

public class Box {
    private float length;
    private float width;
    private float height;

    public Box(float side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    public Box(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getVolume() {
        return length * width * height;
    }

}