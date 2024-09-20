package lab09.quest4;
import java.util.*;
public class ListPoly extends AbstractPoly{
    List<Double> coefficients;
    @Override
    public double[] coefficients() {
        return new double[0];
    }

    @Override
    public double[] coefficients(int degree) {
        return new double[0];
    }

    @Override
    public int degree() {
        return 0;
    }

    @Override
    public Poly derivative() {
        return null;
    }
}
