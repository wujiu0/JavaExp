package exp8.content1;

public class SimulatorTest {
    public static void main(String[] args) {
        Simulator s = new Simulator();
        s.playSound(new Dog("乐乐", "白色", "牧羊犬"));
        s.playSound(new Cat("咪咪","黑白相间","波斯猫"));
        s.playSound(new parrot("唔","红白相间","花鹦鹉"));
    }
}
