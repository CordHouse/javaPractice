package wtcLotto;

public class Output {
    private final static String NEXT_LINE = "\n";
    private StringBuilder sb;
    public void buyLottoMoney(){
        System.out.println("구매금액을 입력해 주세요.");
    }

    public void buyLottoCount(String lottoCount){
        System.out.println(NEXT_LINE+lottoCount+"를 구매했습니다.");
    }

    public void inputWinningNumber(){
        System.out.println(NEXT_LINE+"당첨 번호를 입력해 주세요.");
    }

    public void inputBonusNumber(){
        System.out.println(NEXT_LINE+"보너스 번호를 입력해 주세요.");
    }

    public void aggregation(Lotto lotto){
        sb = new StringBuilder();
        sb.append(NEXT_LINE+"당첨 통계").append(NEXT_LINE);
        sb.append("---").append(NEXT_LINE);
        sb.append("3개 일치 (5,000원) - ").append(lotto.getLottoAggregation("3개")).append("개").append(NEXT_LINE);
        sb.append("4개 일치 (50,000원) - ").append(lotto.getLottoAggregation("4개")).append("개").append(NEXT_LINE);
        sb.append("5개 일치 (1,500,000원) - ").append(lotto.getLottoAggregation("5개")).append("개").append(NEXT_LINE);
        sb.append("5개 일치, 보너스 볼 일치 (30,000,000원) - ").append(lotto.getLottoAggregation("5개+보너스")).append("개").append(NEXT_LINE);
        sb.append("6개 일치 (2,000,000,000원) - ").append(lotto.getLottoAggregation("6개")).append("개");
        System.out.println(sb.toString());
    }

    public void totalProfit(double profitPercent){
        System.out.println("총 수익률은 "+profitPercent+"%입니다.");
    }
}
