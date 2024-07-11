package lastterm.year2223.de2.rootsolver;

public class MyMath {
    public static double sin(double x) {
        /* TODO */
        double res = 0;
        double numerator = x;
        double denominator = 1;
        for (int i = 1; i < 50; i++){
            res += numerator / denominator;
            numerator *= (-1) * x * x;
            denominator *= (2 * i) * (2 * i + 1);
        }
        return res;
    }

    public static double cos(double x) {
        /* TODO */
        double res = 0;
        double numerator = 1;
        double denominator = 1;
        for (int i = 1; i < 50; i++){
            res += numerator / denominator;
            numerator *= (-1) * x * x;
            denominator *= (2 * i - 1) * (2 * i);
        }
        return res;
    }

    public static double exp(double x) {
        /* TODO */
        double res = 0;
        double numerator = 1;
        double denominator = 1;
        for (int i = 1; i < 1000; i++){
            res += numerator / denominator;
            numerator *= x;
            denominator *= i;
        }
        return res;
    }

    public static double ln(double x) {
        /* TODO */
        double res = 0;
        double numerator = x;
        double denominator = 1;
        for (int i = 2; i < 1000; i++){
            res += numerator / denominator;
            numerator *= -x;
            denominator = i;
        }
        return res;
    }
}
