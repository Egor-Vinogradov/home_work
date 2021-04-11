package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
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

        // для примера был взят CalculatorWithOperator
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(new CalculatorWithOperator());
//        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathCopy());
//        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends());

        double rezult = calc.addition(calc.addition(a, calc.multiplication(b, c)),
                calc.pow(calc.division(d, e), g));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + rezult);
        System.out.println("Количество операций: " + calc.getCountOperation());

    }
}
