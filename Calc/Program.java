package Calc;

import java.util.Scanner;

import Calc.Controller.PresenterRation;

import Calc.View.Menu;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChoiseStart p = new ChoiseStart(new PresenterRation(), new Menu(scanner), scanner,
                new ChoiseStartRation(new Menu(scanner), scanner),
                new ChoiseStartComplex(new Menu(scanner), scanner));

        p.start();
    }

}
