package wtcBridge;

import java.io.IOException;
import java.util.List;

public class BridgeGame {
    private Output output = new Output();
    private Input input = new Input();
    private MakeBridge makeBridge = new MakeBridge();
    private List<String> madeBridge;
    private boolean MOVE_CHECK = true;
    private int index = 0;
    private String currentMove;
    private String up = "";
    private String down = "";
    public void init() throws IOException {
        output.printStartMessage();
        output.printInputBridgeLength();
        madeBridge = makeBridge.makeBridge(input.readBridgeSize());
    }

    public void start(){
        do{
            move();
            check(index, currentMove);
            index++;
        } while(MOVE_CHECK);
        retry();
    }

    public void move(){
        output.printMoveMessage();
        currentMove = input.readMoving();
    }

    public void retry(){

    }

    public void check(int index, String move){
        if(!madeBridge.get(index).equals(move))
            MOVE_CHECK = false;
    }

    public void successMove(){
        if(currentMove.equals("U")){
        }
    }

    public String successUp(){
        if(up.isEmpty()){
            return "[ O ]";
        }
        return up.substring(up.length()-1)+"| O ]";
    }

    public String failUp(){
        if(up.isEmpty()){
            return "[ X ]";
        }
        return up.substring(up.length()-1)+"| X ]";
    }

    public String successDown(){
        if(down.isEmpty()){
            return "[ O ]";
        }
        return down.substring(down.length()-1)+"| O ]";
    }

    public String failDown(){
        if(down.isEmpty()){
            return "[ X ]";
        }
        return down.substring(down.length()-1)+"| X ]";
    }
}
