package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
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

        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        double rezult = calc.addition(calc.addition(a, calc.multiplication(b, c)),
                calc.pow(calc.division(d, e), g));



        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + rezult);
        System.out.println("Количество операций: " + calc.getCountOperation());
    }
}
