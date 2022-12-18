package wtcLotto;

import java.util.Arrays;

public class WinMoney {
    public enum Rank {
        FIRST("6개", 2_000_000_000),
        SECOND("5개+보너스", 30_000_000),
        THIRD("5개", 1_500_000),
        FOURTH("4개", 50_000),
        FIFTH("3개", 5_000),
        MISS("0개", 0);

        private final String countOfMatch;
        private final int winningMoney;

        Rank(String countOfMatch, int winningMoney){
            this.countOfMatch = countOfMatch;
            this.winningMoney = winningMoney;
        }

        public static Rank findByRank(String keyCode){
            return Arrays.stream(Rank.values())
                    .filter(rank -> rank.countOfMatch.equals(keyCode))
                    .findAny()
                    .orElse(MISS);
        }

        public String getCountOfMatch() {
            return countOfMatch;
        }

        public int getWinningMoney(String countOfMatch) {
            for(Rank rank : Rank.values()){
                if(countOfMatch.equals(rank.getCountOfMatch())){
                    return winningMoney;
                }
            }
            return 0;
        }
    }
}
