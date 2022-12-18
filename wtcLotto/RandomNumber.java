package wtcLotto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
    private final List<Integer> lottoNumber = new LinkedList<>();

    public List<Integer> getLottoNumber(){
        for(int i = 0; i < 6;) {
            int pick = new Random().nextInt(45)+1;
            if(!lottoNumber.contains(pick)) {
                this.lottoNumber.add(pick);
                i++;
            }
        }
        Collections.sort(lottoNumber);
        return lottoNumber;
    }
}
