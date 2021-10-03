package week3.exp6;

public class Categoriy {
    private int id;
    public String firstLevel;
    public String secondLevel;

    public Categoriy(int id, String firstLevel, String secondLevel) {
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

}
