package wtcBridge;

import java.util.LinkedList;
import java.util.List;

public class MakeBridge {
    private BridgeRandomNumberGenerator bridgeRandomNumberGenerator = new BridgeRandomNumberGenerator();
    private List<String> bridge = new LinkedList<>();
    public List<String> makeBridge(int size){
        for(int i = 0; i < size; i++) {
            bridge.add(checkBridge(bridgeRandomNumberGenerator.generate()));
        }
        return bridge;
    }

    public String checkBridge(int number){
        if(number == 1){
            return "U";
        }
        return "D";
    }
}
