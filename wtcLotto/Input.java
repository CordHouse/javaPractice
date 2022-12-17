package wtcLotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Input {
    private BufferedReader input;
    private final Exception exception = new Exception();

    private int moneyMod;
    private static final int DIVISION_1000 = 1000;

    public int getMoneyMod(){
        return moneyMod / DIVISION_1000;
    }
    public int buyMoney() throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        moneyMod = Integer.parseInt(input.readLine());
        exception.numberAndModErrorCheck(moneyMod);
        return moneyMod / DIVISION_1000;
    }

    public void winningNumber() throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        List<String> winningLotto = List.of(input.readLine().split(","));
        exception.winningNumberError(winningLotto);
    }

    public void bonusNumber() throws IOException {
        input = new BufferedReader(new InputStreamReader(System.in));
        int bonus = Integer.parseInt(input.readLine());
        exception.numberError(bonus);
        exception.winningNumberRangeError(bonus);
    }
}