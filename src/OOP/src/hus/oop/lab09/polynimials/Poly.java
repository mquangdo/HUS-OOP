package hus.oop.lab09.polynimials;

interface Poly {
    double[] coefficients();
    double coefficients(int degree);
    int degree();
    Poly derivative();
}
