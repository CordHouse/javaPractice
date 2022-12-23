package wtcBridge;

public class Output {
    private final String NEXT_LINE = "\n";
    public void printMap(String up, String down){
        System.out.println(up);
        System.out.println(down);
    }

    public void printResult(){

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
}
