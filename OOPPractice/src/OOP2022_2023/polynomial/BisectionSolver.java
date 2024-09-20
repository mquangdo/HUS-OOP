package OOP2022_2023.polynomial;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        double f_lower = polynomial.evaluate(lower);
        double f_upper = polynomial.evaluate(upper);
        double c = (lower + upper) / 2;
        double f_c = polynomial.evaluate(c);
        double eps = 1e-10;
        while (Math.abs(f_c) >= eps){
            if (f_lower * f_c > 0){
                lower = c;
                f_lower = f_c;
            }
            else {
                upper = c;
                f_upper = f_c;
            }
            c = (lower + upper) / 2;
            f_c = polynomial.evaluate(c);
        }
        return c;
    }
}
