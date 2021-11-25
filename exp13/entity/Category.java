package exp13.entity;

import java.io.Serializable;

public class Category implements Serializable {
    private int id;// 类别id
    private String firstLevel;// 商品一级类目
    private String secondLevel;// 商品二级类目

    public Category() {
        this.id = 0;
        this.firstLevel = "firstLevel";
        this.secondLevel = "secondLevel";
    }

    public Category(String firstLevel, String secondLevel) {
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
    }

    public Category(int id, String firstLevel, String secondLevel) {
        this.id = id;
        this.firstLevel = firstLevel;
        this.secondLevel = secondLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstLevel() {
        return firstLevel;
    }

    public void setFirstLevel(String firstLevel) {
        this.firstLevel = firstLevel;
    }

    public String getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(String secondLevel) {
        this.secondLevel = secondLevel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstLevel == null) ? 0 : firstLevel.hashCode());
        result = prime * result + id;
        result = prime * result + ((secondLevel == null) ? 0 : secondLevel.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Category other = (Category) obj;
        if (firstLevel == null) {
            if (other.firstLevel != null)
                return false;
        } else if (!firstLevel.equals(other.firstLevel))
            return false;
        if (secondLevel == null) {
            if (other.secondLevel != null)
                return false;
        } else if (!secondLevel.equals(other.secondLevel))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return firstLevel + " > " + secondLevel;
    }

}
