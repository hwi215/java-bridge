package bridge.controller;

import java.util.ArrayList;
import java.util.List;

import static bridge.model.BridgeMaker.makeBridge;
import static bridge.view.InputView.*;

public class BridgeGameController {
    public static void bridgeGame(){
        int bridgeLen = readBridgeSize();
        bridgeLenRangeCheck(bridgeLen);
        List<String> bridges = new ArrayList<>();
        bridges = makeBridge(bridgeLen);

        String move = readMoving();
        moveCheck(move);


    }
}
