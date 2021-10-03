package week3.exp6;

public class Commodity {
    private int id;
    public String name;
    public String author;
    public int num;
    public Categoriy categoriy;
    
    public Commodity(int id, String name, String author, int num, Categoriy categoriy) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.num = num;
        this.categoriy = categoriy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
}
