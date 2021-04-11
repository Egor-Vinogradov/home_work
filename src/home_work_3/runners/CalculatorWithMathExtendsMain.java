package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        /*
        4.1 + 15 * 7 + (28 / 5) ^ 2
         */
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        int g = 2;

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        double rezult = calc.addition(calc.addition(a, calc.multiplication(b, c)),
                calc.pow(calc.division(d, e), g));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + rezult);
    }
}
