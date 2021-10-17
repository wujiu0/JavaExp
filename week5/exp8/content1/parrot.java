package week5.exp8.content1;

public class parrot extends Pet {

    public parrot() {
    }

    public parrot(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    public void cry() {
       System.out.println("咕咕咕。。。");
    }

    @Override
    public String getType() {
        return "鹦鹉";
    }

}
