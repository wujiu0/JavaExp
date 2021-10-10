package week4.exp7.content1;

public class Rectangle extends Geometric {
    private float length;
    private float width;

    public Rectangle(String color, boolean filed, float length, float width) {
        super(color, filed);
        this.length = length;
        this.width = width;
    }

    public float getArea() {
        return length * width;
    }

    public float getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "矩形" + "\n是否填充：" + isFiled() + "\n创建日期：" + getDate() + "\n长：" + length + "\n宽：" + width + "\n面积："
                + getArea() + "\n周长：" + getPerimeter();
    }
}
