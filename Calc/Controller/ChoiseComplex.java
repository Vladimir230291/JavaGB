package Calc.Controller;

import Calc.Model.ModelKomplex.Complex;
import Calc.Model.ModelKomplex.ComplexPrint;
import Calc.Model.ModelKomplex.ModelComplex;
import Calc.View.ViewComplex;

public class ChoiseComplex {
    ViewComplex view;
    ModelComplex model;

    public ChoiseComplex(ModelComplex m, ViewComplex v) {
        model = m;
        view = v;
    }
    public void buttonClick() {
        String real1 = view.getValue("Введите реальную часть первого числа: ");
        String image1 = view.getValue("Введите мнимую часть первого числа: ");

        String real2 = view.getValue("Введите реальную часть второго числа: ");
        String image2 = view.getValue("Введите мнимую часть второго числа: ");

        double dat1_1 = Double.parseDouble(real1);
        double dat1_2 = Double.parseDouble(image1.substring(0, image1.length() - 1));
        double dat2_1 = Double.parseDouble(real2);
        double dat2_2 = Double.parseDouble(image2.substring(0, image2.length() - 1));

        Complex number1 = new Complex(dat1_1, dat1_2);
        Complex number2 = new Complex(dat2_1, dat2_2);

        model.setX(number1);
        model.setY(number2);

        Complex result = model.result();

        ComplexPrint res = new ComplexPrint(result);

        StringBuilder finalRes = res.print();

        view.print(finalRes, "Result: ");
    }

}
