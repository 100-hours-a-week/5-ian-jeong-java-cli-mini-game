package com.minigame.demo.view.output;

import com.minigame.demo.utils.SimpleOutputUtils;

import static com.minigame.demo.constant.ANSIColor.*;
import static com.minigame.demo.constant.MeaningfulNumber.*;
import static com.minigame.demo.constant.PrintMessage.*;

public class OutputManager {
    public OutputManager() {}

    public void printWelcomeView() {
        SimpleOutputUtils.printHorizontalLine();
        SimpleOutputUtils.printNoLineBreak(WELCOME_MESSAGE, ANSI_PURPLE, TWO);
        SimpleOutputUtils.printHorizontalLine();
        SimpleOutputUtils.breakLine(THREE);
    }

    public void printExitMessage() {
        SimpleOutputUtils.print(EXIT_MESSAGE, ANSI_GREEN);
    }

    public void printGameList() {
        SimpleOutputUtils.print(GAME_LIST_MESSAGE);
    }

    public void printReInputMessage() {
        SimpleOutputUtils.print(GAME_CHOICE_POSSIBLE_INPUT_MESSAGE, ANSI_RED);
        SimpleOutputUtils.print(RE_INPUT_MESSAGE, ANSI_RED);
    }

    public void printGameRule() {
        SimpleOutputUtils.print(GAME_RULE_MESSAGE, ANSI_PURPLE);
        SimpleOutputUtils.breakLine(ONE);
    }

    public void printSpecialReward() {
        SimpleOutputUtils.print(SPECIAL_REWARD_FIRST);
        SimpleOutputUtils.print("🎉 ㅊㅊ", ANSI_PURPLE);

    }
}
