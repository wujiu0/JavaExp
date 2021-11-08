package exp11.content2.entity;

public class Category {
    private int id;// 类别id
    private String firstLevel;// 商品一级类目
    private String secondLevel;// 商品二级类目

    public Category() {
        this.id = 0;
        this.firstLevel = "firstLevel";
        this.secondLevel = "secondLevel";
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
    public String toString() {
        return firstLevel + " > " + secondLevel;
    }

}
