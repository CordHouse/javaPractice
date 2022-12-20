package wtcBaseBall;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MakeRandomNumber {
    private final List<Integer> makeNumber = new LinkedList<>();
    private Random random = new Random();

    public List<Integer> getMakeNumber(){
        for(int i = 0; i < 3;){
            int seed = random.nextInt(9)+1;
            if(!makeNumber.contains(seed)){
                makeNumber.add(seed);
                i++;
            }
        }
        return makeNumber;
    }
}
