package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private ICalculator calculator;
    private int count = 0;

    public CalculatorWithCounterAutoDecorator(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }

    public int getCountOperation() {
        return this.count;
    }

    @Override
    public double addition(double a, double b) {
        count++;
        return calculator.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        count++;
        return calculator.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        count++;
        return calculator.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        count++;
        return calculator.division(a, b);
    }

    @Override
    public double pow(double value, int powValue) {
        count++;
        return calculator.pow(value, powValue);
    }

    @Override
    public double absNumber(double a) {
        count++;
        return calculator.absNumber(a);
    }

    @Override
    public double sqrt(double a) {
        count++;
        return calculator.absNumber(a);
    }
}
