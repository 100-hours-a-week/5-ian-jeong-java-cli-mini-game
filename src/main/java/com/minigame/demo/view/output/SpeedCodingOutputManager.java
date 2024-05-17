package com.minigame.demo.view.output;

import com.minigame.demo.enums.SpeedCode;

import java.io.BufferedWriter;
import java.io.IOException;

public class SpeedCodingOutputManager {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private static final String YES = "YES";
    private static final String NO = "NO";

    private static final String BREAK_LINE = "\n";

    private BufferedWriter bufferedWriter;

    public SpeedCodingOutputManager(BufferedWriter bufferedWriter) {
        this.bufferedWriter = bufferedWriter;
    }

    public void printWelcomeView() throws IOException {
        bufferedWriter.write("─────────────────────────────── 게임 설명 ───────────────────────────────");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("▓ 무작위로 코드가 생성됩니다.");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("▓ 무작위 코드와 제한시간이 주어집니다.");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("▓ 제한시간안에 탭과 띄어쓰기를 포함해서 제시된 코드와 똑같이 입력해야 합니다.");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("▓ 오차없이 동일한 코드를 제한시간안에 입력했다면 보상을 지급합니다 !");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("‼️코드의 난이도에 따라서 보상은 차등지급");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.flush();
    }

    public void printCode(SpeedCode speedCode) throws IOException {
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("🚀 난이도: " + String.valueOf(speedCode.getLevel()));
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("⏰ 제한시간: " + String.valueOf(speedCode.getLimitTime()) + "초");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("🪙 보상: " + String.valueOf(speedCode.getReward()) + "코인");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("────────────────── Code ──────────────────");
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write(speedCode.getCode());
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write(BREAK_LINE);
        bufferedWriter.write("──────────────────────────────────────────");
        bufferedWriter.flush();

    }

}
