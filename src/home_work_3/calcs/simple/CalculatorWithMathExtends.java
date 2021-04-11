package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /** Сложение чисел a и b
     * Унаследован от родительского через super
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение от родительского класса
     */
    @Override
    public double addition(double a, double b) {
        return super.addition(a, b);
    }

    /** Вычитание числа b от a
     * Унаследован от родительского через super
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение от родительского класса
     */
    @Override
    public double subtraction(double a, double b) {
        return super.subtraction(a, b);
    }

    /** Умножение числа a на b
     * Унаследован от родительского через super
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение от родительского класса
     */
    @Override
    public double multiplication(double a, double b) {
        return super.multiplication(a, b);
    }

    /** Деление числа a на b
     * Унаследован от родительского через super
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение от родительского класса
     */
    @Override
    public double division(double a, double b) {
        return super.division(a, b);
    }

    /** Возведение числа в степень
     * Переоопределен от родительского. Реализация через Math
     * @param value входной параметр числа
     * @param powValue входной параметр степени
     * @return возвращает значение через Math
     */
    @Override
    public double pow(double value, int powValue) {
        return Math.pow(value, powValue);
    }

    /** Модуль числа
     * Переоопределен от родительского. Реализация через Math
     * @param a входной параметр
     * @return возвращает значение через Math
     */
    @Override
    public double absNumber(double a) {
        return Math.abs(a);
    }

    /** Квадратный корень числа
     * Переоопределен от родительского. Реализация через Math
     * @param a входной параметр
     * @return возвращает значение через Math
     */
    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }
}
