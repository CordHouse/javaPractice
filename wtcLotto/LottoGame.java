package wtcLotto;

import java.util.List;

public class LottoGame {
    public void play() {
        Lotto lotto = new Lotto(List.of(8, 21, 23, 41, 42, 43));
        long numberMatchCount = lotto.getNumbers().stream().filter(number -> lotto.getWinNumbers().contains(number)).count();
        System.out.println(WinMoney.Rank.FIRST.getWinningMoney(numberMatchCount));
    }

}
