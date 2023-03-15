package Calc;

import java.util.Scanner;
import java.util.logging.*;

import Calc.Controller.PresenterRation;
import Calc.View.Menu;

public class ChoiseStart {

    PresenterRation presenterRation;
    Menu menu;
    Scanner scanner;
    ChoiseStartRation startRation;
    ChoiseStartComplex startComplex;

    public ChoiseStart(PresenterRation presenterRation,
                       Menu menu,
                       Scanner scanner,
                       ChoiseStartRation startRation,
                       ChoiseStartComplex startComplex) {
        this.presenterRation = presenterRation;
        this.menu = menu;
        this.scanner = scanner;
        this.startRation = startRation;
        this.startComplex = startComplex;
    }

    public void start() {
        Logger logger = Logger.getGlobal();
        switch (menu.selectCalc()) {
            case 1 -> {
                logger.info("Выбраны рациональные числа");
                startRation.startRation();
            }
            case 2 -> {
                logger.info("Выбраны комплексные числа");
                startComplex.startComplex();
            }
            default -> logger.info("Ошибка");
        }
    }

}
