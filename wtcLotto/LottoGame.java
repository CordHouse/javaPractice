package wtcLotto;

import java.io.IOException;

public class LottoGame {
    private final Input input = new Input();
    private final Output output = new Output();
    private final Lotto lotto = new Lotto();

    public void init() throws IOException {
        output.buyLottoMoney();
        lotto.buyLottoCycle(input.buyMoney());
        output.buyLottoCount(String.valueOf(input.getMoneyMod()));
        lotto.getAllLotto();
    }
    public void play() throws IOException {
        askWinningNumber();
        askBonusNumber();
        eachLottoMatchCount();
    }

    public void askWinningNumber() throws IOException {
        output.inputWinningNumber();
        lotto.setWinningLottoNumber(input.winningNumber());
    }

    public void askBonusNumber() throws IOException {
        output.inputBonusNumber();
        lotto.setBonusNumber(input.bonusNumber());
    }

    public void eachLottoMatchCount(){
        lotto.setLottoAggregation();
        output.aggregation(lotto);
    }

}
