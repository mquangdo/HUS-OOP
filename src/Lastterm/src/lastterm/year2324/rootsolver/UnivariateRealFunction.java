package lastterm.year2324.rootsolver;

public class UnivariateRealFunction implements AbstractFunction {
    @Override
    public double evaluate(double x) {
        /* TODO */
        return x * MyMath.sin(x) - 3;
    }

    @Override
    public double derivative(double x) {
        /* TODO */
        double deltaX = x - (x - 0.0001);
        double deltaY = evaluate(x) - evaluate(x - 0.0001);
        return deltaY / deltaX;
    }
}
