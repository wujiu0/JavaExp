package week4.exp7;

public class SimulatorTest {
    public static void main(String[] args) {

        Pet p = new Dog();
        Simulator.playSound(p);
        
        p = new Cat();
        Simulator.playSound(p);
        
        
    }
}
