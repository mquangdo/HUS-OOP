package midterm2021.quest2;

public interface Poly {
    public int coefficients(int degree);
    public int[] coefficients();
    public int degree();
    public Poly derivative();
    public double evaluate(double val);
}
