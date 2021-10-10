package week4.exp7;

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
    public String toString() {
        return "狗";
    }
    
    
}
