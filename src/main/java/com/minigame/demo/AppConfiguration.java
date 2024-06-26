package com.minigame.demo;

import com.minigame.demo.controller.GameController;
import com.minigame.demo.controller.MainController;
import com.minigame.demo.controller.game.GuessingNumberController;
import com.minigame.demo.controller.game.HorseRacingController;
import com.minigame.demo.controller.game.SpeedCodingController;
import com.minigame.demo.controller.game.StoppingNumberController;
import com.minigame.demo.service.GuessingNumberGame;
import com.minigame.demo.service.HorseRacingGame;
import com.minigame.demo.service.SpeedCodingGame;
import com.minigame.demo.service.StoppingNumberGame;
import com.minigame.demo.view.input.InputManager;
import com.minigame.demo.view.input.game.GuessingNumberInputManager;
import com.minigame.demo.view.input.game.HorseRacingInputManager;
import com.minigame.demo.view.input.game.SpeedCodingInputManager;
import com.minigame.demo.view.input.game.StoppingNumberInputManager;
import com.minigame.demo.view.output.OutputManager;
import com.minigame.demo.view.output.game.GuessingNumberOutputManager;
import com.minigame.demo.view.output.game.HorseRacingOutputManager;
import com.minigame.demo.view.output.game.SpeedCodingOutputManager;
import com.minigame.demo.view.output.game.StoppingNumberOutputManager;

public class AppConfiguration {
    public MainController mainController() {
        return new MainController(
                new InputManager(),
                new OutputManager(),
                guessingNumberController(),
                stoppingNumberController(),
                speedCodingController(),
                horseRacingController()
        );
    }

    public GameController guessingNumberController() {
        return new GuessingNumberController(
                new GuessingNumberInputManager(),
                new GuessingNumberOutputManager(),
                new GuessingNumberGame()
        );
    }

    public GameController stoppingNumberController() {
        return new StoppingNumberController(
                new StoppingNumberInputManager(),
                new StoppingNumberOutputManager(),
                new StoppingNumberGame()
        );
    }

    public GameController speedCodingController() {
        return new SpeedCodingController(
                new SpeedCodingInputManager(),
                new SpeedCodingOutputManager(),
                new SpeedCodingGame()
        );
    }

    public GameController horseRacingController() {
        return new HorseRacingController(
                new HorseRacingInputManager(),
                new HorseRacingOutputManager(),
                new HorseRacingGame()
        );
    }
}
