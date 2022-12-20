package wtcBaseBall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Input {
    private Exception exception = new Exception();
    public List<Integer> askNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> number = Arrays.stream(br.readLine().split("")).map(Integer::parseInt).toList();
        exception.numberAndSizeException(number);
        return number;
    }

    public int askRestart() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }
}
