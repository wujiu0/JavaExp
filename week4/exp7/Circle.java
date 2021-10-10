package week4.exp7;

public class Circle extends Geometric {
    private float radius;

    public Circle(String color, boolean filed, float radius) {
        super(color, filed);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    public float getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return "圆" + "\n是否填充：" + isFiled() + "\n创建日期：" + getDate() + "\n直径：" + getDiameter() + "\n面积：" + getArea()
                + "\n周长：" + getPerimeter();
    }
}
