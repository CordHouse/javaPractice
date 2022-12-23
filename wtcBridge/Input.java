package wtcBridge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private BufferedReader br;
    public int readBridgeSize() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public String readMoving(){
        return null;
    }

    public String readGameCommand(){
        return null;
    }
}
