package wtcBridge;

import java.io.IOException;
import java.util.List;

public class BridgeGame {
    private Output output = new Output();
    private Input input = new Input();
    private MakeBridge makeBridge = new MakeBridge();
    private List<String> madeBridge;
    private int bridgeSize;
    private boolean MOVE_CHECK;
    private int index;
    private int retryCount = 1;
    private String currentMove;
    private String up;
    private String down;
    private final String SUCCESS = "성공";
    private final String FAIL = "실패";

    public void init() throws IOException {
        output.printStartMessage();
        output.printInputBridgeLength();
        bridgeSize = input.readBridgeSize();
        madeBridge = makeBridge.makeBridge(bridgeSize);
        output.printBlankLine();
        valueInit();
    }

    public void valueInit(){
        MOVE_CHECK = true;
        index = 0;
        up = "";
        down = "";
    }

    public void start() throws IOException {
        while (MOVE_CHECK && bridgeSize > index) {
            move();
            check(index, currentMove);
            output.printMap(up, down);
            index++;
        }
        if(bridgeSize != index)
            retry();
    }

    public void move() throws IOException {
        output.printMoveMessage();
        currentMove = input.readMoving();
    }

    public void retry() throws IOException {
        output.printAskRetry();
        if(input.readGameCommand().equals("R")){
            valueInit();
            retryCount++;
            start();
        }
    }

    public void gameOver(){
        if(bridgeSize == index) {
            output.printResult(SUCCESS, retryCount);
            return;
        }
        output.printResult(FAIL, retryCount);
    }

    public void check(int index, String move) {
        if (!madeBridge.get(index).equals(move)) {
            MOVE_CHECK = false;
            failMove();
            return;
        }
        successMove();
    }

    public void successMove() {
        if (currentMove.equals("U")) {
            up = successUp();
            down = blankDown();
            return;
        }
        down = successDown();
        up = blankUp();
    }

    public void failMove() {
        if (currentMove.equals("U")) {
            up = failUp();
            down = blankDown();
            return;
        }
        down = failDown();
        up = blankUp();
    }

    public String successUp() {
        if (up.isEmpty()) {
            return "[ O ]";
        }
        return up.substring(0, up.length() - 1) + "| O ]";
    }

    public String failUp() {
        if (up.isEmpty()) {
            return "[ X ]";
        }
        return up.substring(0, up.length() - 1) + "| X ]";
    }

    public String successDown() {
        if (down.isEmpty()) {
            return "[ O ]";
        }
        return down.substring(0, down.length() - 1) + "| O ]";
    }

    public String failDown() {
        if (down.isEmpty()) {
            return "[ X ]";
        }
        return down.substring(0, down.length() - 1) + "| X ]";
    }

    public String blankUp() {
        if (up.isEmpty()) {
            return "[   ]";
        }
        return up.substring(0, up.length() - 1) + "|   ]";
    }

    public String blankDown() {
        if (down.isEmpty()) {
            return "[   ]";
        }
        return down.substring(0, down.length() - 1) + "|   ]";
    }
}
