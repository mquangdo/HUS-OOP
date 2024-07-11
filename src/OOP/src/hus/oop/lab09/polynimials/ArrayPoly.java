package hus.oop.lab09.polynimials;
import java.util.*;

public class ArrayPoly extends AbstractPoly{
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients){
        this.coefficients = coefficients;
    }

    @Override
    public double[] coefficients() {
        return coefficients;
    }

    @Override
    public double coefficients(int degree) {
        return coefficients[degree];
    }

    @Override
    public int degree() {
        for (int i = coefficients.length - 1; i >= 0; i--){
            if (coefficients[i] != 0){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public Poly derivative() {
        double[] newCoeff = derive();
        Poly poly = new ArrayPoly(newCoeff);
        return poly;
    }
}
