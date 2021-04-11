package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    /** Сложение чисел a и b
     *
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение сложения
     */
    public double addition(double a, double b) {
        return a + b;
    }

    /** Вычитание числа b от a
     *
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение вычитания чисел
     */
    public double subtraction(double a, double b) {
        return a - b;
    }

    /** Умножение числа a на b
     *
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение умножения чисел
     */
    public double multiplication(double a, double b) {
        return a * b;
    }

    /** Деление числа a на b
     *
     * @param a входной параметр
     * @param b входной параметр
     * @return возвращает значение деления чисел
     */
    public double division(double a, double b) {
        return a / b;
    }

    /** Возведение числа в степень
     * Реализация через цикл. При каждой итерации число умножается на входной параметр
     * @param value входной параметр числа
     * @param powValue входной параметр степени
     * @return возвращает значение возведения числа в степень через цикл
     */
    public double pow(double value, int powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }

    /** Модуль числа
     * Решение взято из класса Math))
     * @param a входной параметр
     * @return возвращает значение модуля числа
     */
    public double absNumber(double a) {
        return (a <= 0.0D) ? 0.0D - a : a;
    }

    /** Квадратный корень числа
     * Через цикл приближает к среднему значению
     * @param a входной параметр
     * @return возвращает значение корня числа
     */
    public double sqrt(double a) {
        if(a == 0 || a == 1) {
            return a;
        }
        double start = 1;
        double end = a / 2;
        while(start <= end) {
            double mid = start + (end - start) / 2;
            if(mid == a / mid) {
                return mid;
            }
            if(mid < a / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start - 1;
    }
}
