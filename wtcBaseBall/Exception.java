package wtcBaseBall;

import java.io.IOException;
import java.util.List;

public class Exception {
    public void numberAndSizeException(List<Integer> number) throws IOException {
        numberException(number);
        sizeException(number);
    }

    public void numberException(List<Integer> number) throws IOException {
        if(number.stream().distinct().count() != 3){
            throw new IOException("중복된 숫자가 있습니다.");
        }
    }

    public void sizeException(List<Integer> number) throws IOException {
        if(number.size() != 3){
            throw new IOException("숫자 3개를 입력해주세요.");
        }
    }
}
