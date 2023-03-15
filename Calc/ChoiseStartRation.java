package Calc;

import java.util.Scanner;
import java.util.logging.*;

import Calc.Controller.PresenterRation;
import Calc.Model.ModelRational.DivModelRational;
import Calc.Model.ModelRational.MultModelRational;
import Calc.Model.ModelRational.SubModelRational;
import Calc.Model.ModelRational.SumModelRational;
import Calc.View.Menu;
import Calc.View.ViewRational;

public class ChoiseStartRation {
    Menu menu;
    Scanner scanner;

    public ChoiseStartRation(Menu menu, Scanner scanner) {
        this.menu = menu;
        this.scanner = scanner;
    }

    public void startRation() {
        Logger logger = Logger.getGlobal();
        switch (menu.selectFunction()) {
            case 1 -> {
                System.out.println("Какие числа будем суммировать?");
                PresenterRation p1 = new PresenterRation(new SumModelRational(), new ViewRational());
                p1.buttonClick();
                logger.info("Вычисление прошло успешно");
            }
            case 2 -> {
                System.out.println("Какие числа будем вычитать?");
                PresenterRation p2 = new PresenterRation(new SubModelRational(), new ViewRational());
                p2.buttonClick();
                logger.info("Вычисление прошло успешно");
            }
            case 3 -> {
                System.out.println("Какие числа будем умножать?");
                PresenterRation p3 = new PresenterRation(new MultModelRational(), new ViewRational());
                p3.buttonClick();
                logger.info("Вычисление прошло успешно");
            }
            case 4 -> {
                System.out.println("Какие числа будем делить?");
                PresenterRation p4 = new PresenterRation(new DivModelRational(), new ViewRational());
                p4.buttonClick();
                logger.info("Вычисление прошло успешно");
            }
            default -> {
                System.out.println("Неверный ввод");
                logger.info("Ошибка");
            }
        }

    }

}
