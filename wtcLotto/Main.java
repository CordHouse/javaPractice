package wtcLotto;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            LottoGame lottoGame = new LottoGame();
            lottoGame.init();
            lottoGame.play();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
