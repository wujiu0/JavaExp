package exp06;

public class Commodity {
    private int id;
    public String name;
    public String author;
    public int num;
    public Category category;
    
    public Commodity(int id, String name, String author, int num, Category category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.num = num;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Commodity [author=" + author + ", category=" + category + ", id=" + id + ", name=" + name + ", num="
                + num + "]";
    }

    
}
