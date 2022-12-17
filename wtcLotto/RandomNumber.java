package wtcLotto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private final List<Integer> lottoNumber = new LinkedList<>();

    public List<Integer> getLottoNumber(){
        for(int i = 0; i < 6; i++) {
            this.lottoNumber.add(new Random().nextInt(45)+1);
        }
        Collections.sort(lottoNumber);
        return lottoNumber;
    }
}
