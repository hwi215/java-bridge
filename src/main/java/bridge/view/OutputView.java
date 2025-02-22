package bridge.view;

import java.util.ArrayList;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printMap(String first, String second) {
        System.out.println(first);
        System.out.println(second);
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public static void printResult(ArrayList<String> resultFinal, int startCount, int code) {
        System.out.println("");
        System.out.println("최종 게임 결과");
        System.out.println(resultFinal.get(1));
        System.out.println(resultFinal.get(2));
        System.out.println("");
        if(code == 0){
            System.out.println("게임 성공 여부: 성공");
        }
        if(code == 1){
            System.out.println("게임 성공 여부: 실패");
        }
        System.out.println("총 시도한 횟수: " + startCount);

    }

}
