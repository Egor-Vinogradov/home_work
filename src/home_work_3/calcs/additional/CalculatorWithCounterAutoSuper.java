package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long count = 0;

    /**
     * При каждой операции увеличиваем счетчик на 1
     */
    public void incrementCountOperation() {
        count++;
    }

    /**
     * Возвращаем значение счетчика при использовании класса
     * @return возвращает значение счетчика
     */
    public long getCountOperation() {
        return count;
    }

    @Override
    public double addition(double a, double b) {
        incrementCountOperation();
        return super.addition(a, b);
    }

    @Override
    public double subtraction(double a, double b) {
        incrementCountOperation();
        return super.subtraction(a, b);
    }

    @Override
    public double multiplication(double a, double b) {
        incrementCountOperation();
        return super.multiplication(a, b);
    }

    @Override
    public double division(double a, double b) {
        incrementCountOperation();
        return super.division(a, b);
    }

    @Override
    public double pow(double value, int powValue) {
        incrementCountOperation();
        return super.pow(value, powValue);
    }

    @Override
    public double absNumber(double a) {
        incrementCountOperation();
        return super.absNumber(a);
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return super.sqrt(a);
    }
}
