package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoCompositeInterface implements ICalculator {
    private ICalculator calculator;
    private long count;

    public CalculatorWithCounterAutoCompositeInterface(ICalculator calculator) {
        this.calculator = calculator;
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
        return calculator.sqrt(a);
    }

    /**
     * Возвращаем значение счетчика при использовании класса
     * @return возвращает значение счетчика
     */
    public long getCountOperation() {
        return count;
    }
}
