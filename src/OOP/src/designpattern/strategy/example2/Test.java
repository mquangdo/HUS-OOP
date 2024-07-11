package designpattern.strategy.example2;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Double, Double> f = x -> x * x;
        System.out.println(integrate1(f, 0, 2));
    }

    public static double integrate1(Function<Double, Double> f, double lower, double upper){
        int maxIter = 10000;
        double temp = f.apply(lower) + f.apply(upper);
        double step = (upper - lower) / maxIter;
        for (int i = 1; i <= maxIter - 1; i++){
            temp += 2 * f.apply(lower + i * step);
        }
        return temp * step / 2;
    }

    public static double integrate2(Function<Double, Double> f, double lower, double upper){
        return 0;
    }
}
