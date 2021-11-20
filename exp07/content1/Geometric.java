package exp07.content1;

import java.util.Date;

public class Geometric {
    private String color;
    private boolean filled;
    private Date date;

    public Geometric(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        // date = new Date(System.currentTimeMillis());
        date = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filled;
    }

    public void setFiled(boolean filled) {
        this.filled = filled;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "";
    }
}
