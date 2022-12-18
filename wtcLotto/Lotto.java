package wtcLotto;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Lotto {

    private final List<List<Integer>> lottoList = new LinkedList<>();
    private List<Integer> winningLottoNumber = new LinkedList<>();
    private int bonusNumber;
    private final HashMap<String, Integer> lottoAggregation = new HashMap<>();
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

    public void setWinningLottoNumber(List<Integer> winningLottoNumber){
        this.winningLottoNumber = winningLottoNumber;
    }

    public void setBonusNumber(int bonusNumber){
        this.bonusNumber = bonusNumber;
    }

    public void setLottoAggregation(){
        for(int i = 0; i < 6; i++) {
            String key = winningNumberMatchLottoNumber(i) + BonusNumberMatchLottoNumber(i, winningNumberMatchLottoNumber(i));
            if(!winningNumberMatchLottoNumber(i).equals("")) {
                lottoAggregation.put(key, lottoAggregation.getOrDefault(key, 0) + 1);
            }
        }
    }

    public int getLottoAggregation(String key){
        if(lottoAggregation.containsKey(key)){
            return lottoAggregation.get(key);
        }
        return 0;
    }

    public String winningNumberMatchLottoNumber(int index){
        int count = 0;
        for(Integer winning : winningLottoNumber) {
            if(getLotto(index).contains(winning)){
                count++;
            }
        }
        if(count >= 3)
            return count+"개";
        return "";
    }

    public String BonusNumberMatchLottoNumber(int index, String count){
        if(!count.equals("5개")){
            return "";
        }
        for(Integer winning : getLotto(index)){
            if(winning == bonusNumber){
                return "+보너스";
            }
        }
        return "";
    }

    public int getTotalMoney(){
        int curTotal = 0;
        for(String key : lottoAggregation.keySet()){
            curTotal += (WinMoney.Rank.findByRank(key).getWinningMoney(key) * lottoAggregation.get(key));
        }
        return curTotal;
    }

}
