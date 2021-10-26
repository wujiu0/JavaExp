package exp7.content3;

import exp7.content2.*;

public class SimulatorTest {
    public static void main(String[] args) {

        Pet p = new Dog();
        Simulator.playSound(p);

        p = new Cat();
        Simulator.playSound(p);

    }
}
