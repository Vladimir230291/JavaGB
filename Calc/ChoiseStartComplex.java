package Calc;

import java.util.logging.*;
import java.util.Scanner;

import Calc.Controller.ChoiseComplex;
import Calc.Model.ModelKomplex.DivModelComplex;
import Calc.Model.ModelKomplex.MultModelComplex;
import Calc.Model.ModelKomplex.SubModelComplex;
import Calc.Model.ModelKomplex.SumModelComplex;
import Calc.View.Menu;
import Calc.View.ViewComplex;

public class ChoiseStartComplex {

    Menu menu;
    Scanner scanner;

    public ChoiseStartComplex(Menu menu, Scanner scanner) {
        this.menu = menu;
        this.scanner = scanner;
    }

    public void startComplex() {
        Logger logger = Logger.getGlobal();
        switch (menu.selectFunction()) {
            case 1 -> {
                System.out.println("Какие числа будем суммировать?");
                ChoiseComplex p1 = new ChoiseComplex(new SumModelComplex(), new ViewComplex());
                p1.buttonClick();
                logger.info("Вычисление прошло успешно");
            }
            case 2 -> {
                System.out.println("Какие числа будем вычитать?");
                ChoiseComplex p2 = new ChoiseComplex(new SubModelComplex(), new ViewComplex());
                p2.buttonClick();
                logger.info("Вычисление прошло успешно");
            }
            case 3 -> {
                System.out.println("Какие числа будем умножать?");
                ChoiseComplex p3 = new ChoiseComplex(new MultModelComplex(), new ViewComplex());
                p3.buttonClick();
                logger.info("Вычисление прошло успешно");
            }
            case 4 -> {
                System.out.println("Какие числа будем делить?");
                ChoiseComplex p4 = new ChoiseComplex(new DivModelComplex(), new ViewComplex());
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
