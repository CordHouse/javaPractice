package wtcBridge;

import java.util.Random;

public class BridgeRandomNumberGenerator {
    public int generate(){
        Random random = new Random();
        return random.nextInt(2);
    }
}
