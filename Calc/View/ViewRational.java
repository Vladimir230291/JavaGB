package Calc.View;

import java.util.Scanner;

public class ViewRational {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }


    public void print(double data, String title) {
        System.out.printf("%s %f\n", title, data);
    }

}
