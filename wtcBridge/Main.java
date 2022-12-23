package wtcBridge;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BridgeGame bridgeGame = new BridgeGame();
            bridgeGame.init();
            bridgeGame.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
