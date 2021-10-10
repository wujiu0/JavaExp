package week4.exp7.content1;

import java.sql.Date;

public class Geometric {
    private String color;
    private boolean filed;
    private Date date;

    public Geometric(String color, boolean filed) {
        this.color = color;
        this.filed = filed;
        date = new Date(System.currentTimeMillis());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filed;
    }

    public void setFiled(boolean filed) {
        this.filed = filed;
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
