package week5.exp8.content1;

public class Cat extends Pet {
    public Cat() {
    }

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    public void cry() {
        System.out.println("喵喵喵。。。");
    }

    @Override
    public String getType() {
        return "猫";
    }

}
