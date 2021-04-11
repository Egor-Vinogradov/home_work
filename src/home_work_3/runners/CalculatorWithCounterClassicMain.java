package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
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

        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

//        double rezult = calc.addition(calc.addition(a, calc.multiplication(b, c)),
//                calc.pow(calc.division(d, e), g));

        /*
        Специально для этого задания расписываем на метода
        чтобы не использовать super
         */
        double rezult1 = calc.division(d, e);
        calc.incrementCountOperation();
        double rezult2 = calc.pow(rezult1, g);
        calc.incrementCountOperation();
        double rezult3 = calc.multiplication(b, c);
        calc.incrementCountOperation();
        double rezult4 = calc.addition(a, rezult3);
        calc.incrementCountOperation();
        double rezult = calc.addition(rezult4, rezult2);
        calc.incrementCountOperation();

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + rezult);
        System.out.println("Количество операций: " + calc.getCountOperation());
    }
}
