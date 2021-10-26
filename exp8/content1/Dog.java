package exp8.content1;

public class Dog extends Pet {

    public Dog() {
    }

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    public void cry() {
        System.out.println("汪汪汪。。。");
    }

    @Override
    public String getType() {
        return "狗";
    }
}
