package wtcLotto;

public class Output {
    private final static String NEXT_LINE = "\n";
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
}
