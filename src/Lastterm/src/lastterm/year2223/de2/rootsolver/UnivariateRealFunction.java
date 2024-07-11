package lastterm.year2223.de2.rootsolver;

public class UnivariateRealFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        /* TODO */
        return x * MyMath.sin(x) - 3;
    }

    @Override
    public double derivative(double x){
        double deltaX = x - (x - 0.00000001);
        double deltaY = evaluate(x) - evaluate(x - 0.00000001);
        return deltaY / deltaX;
    }
}
