package wtcLotto;

import java.io.IOException;

public class LottoGame {
    private final Input input = new Input();
    private final Output output = new Output();
    private final Lotto lotto = new Lotto();
    public void play() throws IOException {
        output.buyLottoMoney();
        lotto.buyLottoCycle(input.buyMoney());
        output.buyLottoCount(String.valueOf(input.getMoneyMod()));
        lotto.getAllLotto();
        askWinningNumber();
        askBonusNumber();
    }

    public void askWinningNumber() throws IOException {
        output.inputWinningNumber();
        input.winningNumber();
    }

    public void askBonusNumber() throws IOException {
        output.inputBonusNumber();
        input.bonusNumber();
    }

}
