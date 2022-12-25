package wtcBridge;

public class Output {
    private final String NEXT_LINE = "\n";
    private String up;
    private String down;
    public void printMap(String up, String down){
        this.up = up;
        this.down = down;
        System.out.println(up);
        System.out.println(down);
    }

    public void printResult(String result, int count){
        System.out.println("최종 게임 결과");
        System.out.println(up);
        System.out.println(down);
        System.out.println("게임 성공 여부: " + result);
        System.out.println("총 시도한 횟수: " + count);
    }

    public void printStartMessage(){
        System.out.println("다리 건너기 게임을 시작합니다."+NEXT_LINE);
    }

    public void printInputBridgeLength(){
        System.out.println("다리의 길이를 입력해주세요.");
    }

    public void printMoveMessage(){
        System.out.println("이동할 칸을 선택해주세요.");
    }

    public void printBlankLine(){
        System.out.println();
    }

    public void printAskRetry(){
        System.out.println("게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)");
    }
}
