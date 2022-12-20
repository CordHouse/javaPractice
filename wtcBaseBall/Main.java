package wtcBaseBall;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BaseBallGame baseBallGame = new BaseBallGame();
            baseBallGame.init();
            baseBallGame.start();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
