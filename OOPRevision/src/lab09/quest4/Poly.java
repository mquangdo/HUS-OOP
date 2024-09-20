package lab09.quest4;

public interface Poly {
    double[] coefficients();
    double[] coefficients(int degree);
    int degree();
    Poly derivative();
}
