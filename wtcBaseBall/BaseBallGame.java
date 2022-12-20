package wtcBaseBall;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class BaseBallGame {
    private List<Integer> madeRandomNumber;
    private String compareResult;
    private final MakeRandomNumber makeRandomNumber = new MakeRandomNumber();
    private Input input = new Input();
    private Output output = new Output();

    public void setMadeRandomNumber(List<Integer> madeRandomNumber){
        this.madeRandomNumber =  madeRandomNumber;
    }

    public void init(){
        setMadeRandomNumber(makeRandomNumber.getMakeNumber());
        output.init();
    }

    public void start() throws IOException {
        do {
            output.inputNumber();
            compareResult = compareInputAndMadeNumber(input.askNumber());
            output.resultMessage(compareResult);
        } while (!compareResult.contains("3스트라이크"));
        if(output.askRestart() == 1){
            start();
        }
        output.endMessage();
    }

    public String compareInputAndMadeNumber(List<Integer> inputNumber){
        StringBuilder sb = new StringBuilder();
        sb.append(strikeCheck(inputNumber, 0));
        sb.append(ballCheck(inputNumber, 0));
        if(sb.toString().equals("")){
            sb.append("낫싱");
        }
        return sb.toString();
    }

    public String strikeCheck(List<Integer> inputNumber, int strike){
        for(int i = 0; i < 3; i++){
            if(Objects.equals(madeRandomNumber.get(i), inputNumber.get(i))){
                strike++;
            }
        }
        if(strike!=0){
            return strike+"스트라이크 ";
        }
        return "";
    }

    public String ballCheck(List<Integer> inputNumber, int ball){
        for(int i = 0; i < 3; i++){
            if(!Objects.equals(madeRandomNumber.get(i), inputNumber.get(i)) && madeRandomNumber.contains(inputNumber.get(i))){
                ball++;
            }
        }
        if(ball!=0){
            return ball+"볼 ";
        }
        return "";
    }
}
