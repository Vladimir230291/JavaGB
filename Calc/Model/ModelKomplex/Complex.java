package Calc.Model.ModelKomplex;

public class Complex {

    /**
     * real - реальная часть
     * image - мнимая часть
     */

    double real;
    double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }


    public double getImage() {
        return image;
    }



}
