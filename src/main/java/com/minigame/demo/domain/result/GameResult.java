package com.minigame.demo.domain.result;

public class GameResult {
    private boolean isWinner;

    public GameResult(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public boolean isWinner() {
        return isWinner;
    }
}
