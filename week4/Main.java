package week4;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("乐乐", "黑色", "牧羊犬");
        Pet cat  = new Cat("咪咪", "白色", "波斯猫");

        dog.speak();
        cat.speak();
    }
}
