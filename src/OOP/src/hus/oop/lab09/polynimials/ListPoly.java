package hus.oop.lab09.polynimials;
import java.util.*;
public class ListPoly extends AbstractPoly{
    List<Double> coefficients;
    public ListPoly(double[] coeffs){
        coefficients = new ArrayList<>();
        for (double c : coeffs){
            coefficients.add(c);
        }
    }

    @Override
    public double[] coefficients() {
        double[] coef = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++){
            coef[i] = coefficients.get(i);
        }
        return coef;
    }

    @Override
    public double coefficients(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public int degree(){
        for (int i = coefficients.size() - 1; i >= 0; i++){
            if (coefficients.get(i) != 0){
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
