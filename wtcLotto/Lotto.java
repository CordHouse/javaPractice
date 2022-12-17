package wtcLotto;

import java.util.LinkedList;
import java.util.List;

public class Lotto {

    private final List<List<Integer>> lottoList = new LinkedList<>();
    public void buyLottoCycle(int cycle){
        for(int i = 0; i < cycle; i++){
            lottoList.add(new RandomNumber().getLottoNumber());
        }
    }
    public List<Integer> getLotto(int index){
        return lottoList.get(index);
    }

    public void getAllLotto(){
        for(List<Integer> values : lottoList){
            System.out.println(values);
        }
    }

}
