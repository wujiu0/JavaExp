package week6.exp9.content1;

import java.util.Random;

public class IdGenerator {
    private Random idGenerator = new Random(/* System.currentTimeMillis() */);

    public IdGenerator() {
    }

    public int getNextId() {
        return idGenerator.nextInt(10000000);
    }
    
}
