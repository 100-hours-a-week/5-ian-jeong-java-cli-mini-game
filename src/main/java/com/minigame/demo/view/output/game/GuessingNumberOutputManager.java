package com.minigame.demo.view.output.game;

import com.minigame.demo.domain.GameResult;
import com.minigame.demo.domain.ResultNumbers;
import com.minigame.demo.utils.SimpleOutputUtils;

import java.util.Random;

import static com.minigame.demo.constant.ANSIColor.*;
import static com.minigame.demo.constant.MeaningfulNumber.*;
import static com.minigame.demo.constant.PrintMessage.*;

public class GuessingNumberOutputManager implements GameOutputManager {
    public GuessingNumberOutputManager() {}

    @Override
    public void printWelcomeView() {
        SimpleOutputUtils.print(GUESSING_NUMBER_WELCOME_MESSAGE);
        SimpleOutputUtils.breakLine(ONE);
    }

    @Override
    public void printResult(GameResult gameResult) throws InterruptedException {
        boolean isWinner = gameResult.isWinner();
        ResultNumbers resultNumbers = gameResult.getResultNumbers();

        SimpleOutputUtils.printNoLineBreak(BLOCK_MESSAGE);

        Random random = new Random();

        for (Integer number : resultNumbers.getNumbers()) {
            SimpleOutputUtils.printNoLineBreak(SPACE);

            for(int i = ZERO; i < RANDOM_COUNT; i++) {
                SimpleOutputUtils.printNoLineBreak(String.valueOf(random.nextInt(RANDOM_RANGE)));
                Thread.sleep(ZERO_POINT_ONE_SECOND);
                SimpleOutputUtils.removeCharacter();
            }

            SimpleOutputUtils.printNoLineBreak(String.valueOf(number) + SPACE + BLOCK_MESSAGE);
        }

        SimpleOutputUtils.breakLine(TWO);

        if (!isWinner) {
            SimpleOutputUtils.print(NEXT_CHANCE_MESSAGE, ANSI_BLUE);

            return;
        }

        SimpleOutputUtils.print(WIN_MESSAGE, ANSI_BLUE);
        SimpleOutputUtils.print(REWARD_MESSAGE, ANSI_BLUE);
    }

    @Override
    public void printReInputMessage() {
        SimpleOutputUtils.print(GUESSING_NUMBER_POSSIBLE_INPUT_MESSAGE, ANSI_RED);
        SimpleOutputUtils.print(RE_INPUT_MESSAGE, ANSI_RED);
    }
}
