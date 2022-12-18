package wtcLotto;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Exception {
    private static final String number = "^[0-9]+$";
    private static final String ERROR_HEADER = "[ERROR] ";

    public void numberAndModErrorCheck(int checkNumber) throws IOException {
        numberError(checkNumber);
        numberNotModError(checkNumber);
    }
    public void numberError(int inputNumber) throws IOException {
        if(!Pattern.matches(number, String.valueOf(inputNumber))){
            throw new IOException(ERROR_HEADER+"숫자만 입력해주세요.");
        }
    }

    public void numberNotModError(int money) throws IOException {
        if(money % 1000 != 0){
            throw new IOException(ERROR_HEADER+"천원 단위로 입력해주세요.");
        }
    }

    public void winningNumberError(List<String> winningLotto) throws IOException {
        lengthError(winningLotto);
        winningNumberRangeError(winningLotto);
    }

    private void lengthError(List<String> winningLotto) throws IOException {
        Stream<String> winningLottoStream = winningLotto.stream();
        if(winningLottoStream.count() != 6){
            throw new IOException(ERROR_HEADER+"당첨번호는 총 6자리 입니다.");
        }
    }

    private void winningNumberRangeError(List<String> winningLotto) throws IOException {
        Stream<String> winningLottoStream = winningLotto.stream();
        if(winningLottoStream.anyMatch(winningNumber -> Integer.parseInt(winningNumber) < 1)){
            throw new IOException(ERROR_HEADER+"1~45사이 숫자로 입력해주세요.");
        }
    }

    public void winningNumberRangeError(int bonus) throws IOException {
        if(bonus < 1 || bonus > 45){
            throw new IOException(ERROR_HEADER+"1~45사이 숫자로 입력해주세요.");
        }
    }

    public void winningNumberAndBonusNumberSameCheck(List<String> winning, int bonus) throws IOException {
        if(winning.stream().anyMatch(number -> number.equals(String.valueOf(bonus)))){
            throw new IOException(ERROR_HEADER+"당첨번호 안에 있는 숫자입니다.");
        }
    }
}
