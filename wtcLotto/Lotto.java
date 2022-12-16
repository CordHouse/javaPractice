package wtcLotto;

import java.util.LinkedList;
import java.util.List;

public class Lotto {

    private final List<Integer> numbers;
    private final List<Integer> winNumbers = new LinkedList<>(List.of(8, 21, 23, 25, 26, 42));

    public Lotto(List<Integer> numbers){
        this.numbers = numbers;
    }
    public List<Integer> getNumbers(){
        return numbers;
    }

    public List<Integer> getWinNumbers() {
        return winNumbers;
    }

}
