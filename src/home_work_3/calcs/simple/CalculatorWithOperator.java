package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double pow(double value, int powValue) {
        double result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }

    public double absNumber(double a) {
        return (a <= 0.0D) ? 0.0D - a : a;
    }

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
