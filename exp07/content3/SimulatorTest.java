package exp07.content3;

import exp07.content2.*;

public class SimulatorTest {
    public static void main(String[] args) {

        Pet p = new Dog();
        Simulator.playSound(p);

        p = new Cat();
        Simulator.playSound(p);

    }
}
