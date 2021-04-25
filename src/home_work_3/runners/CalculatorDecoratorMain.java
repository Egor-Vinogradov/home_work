package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
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

        ICalculator calc = new CalculatorWithCounterAutoDecorator(
                new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        double results = calc.addition(calc.addition(a, calc.multiplication(b, c)),
                calc.pow(calc.division(d, e), g));

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + results);

        if (calc instanceof CalculatorWithCounterAutoDecorator){
            long count = ((CalculatorWithCounterAutoDecorator) calc).getCountOperation();
            System.out.println("Калькулятор был использован " + count + " раз.");

            ICalculator calc2 = (((CalculatorWithCounterAutoDecorator)calc).getCalculator());
            if (calc2 instanceof CalculatorWithMemoryDecorator){
                ((CalculatorWithMemoryDecorator) calc2).setMemoryLastOperation();
                double memory = ((CalculatorWithMemoryDecorator) calc2).getMemory();
                System.out.println("Результат последнего сохранения в памяти калькулятора: " + memory);
            }
        }

    }
}
