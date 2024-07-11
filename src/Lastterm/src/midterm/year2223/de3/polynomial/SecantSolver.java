package midterm.year2223.de3.polynomial;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp Secant
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức trong khoảng [lower, upper]
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        int n = 0;
        double prevX = 0;
        while (n <= maxIterations){
            double x = upper - polynomial.evaluate(upper) * (upper - lower) / (polynomial.evaluate(upper) - polynomial.evaluate(lower));
            if (polynomial.evaluate(x) == 0 || Math.abs(x - prevX) < tolerance){
                return x;
            }else {
                prevX = x;
                lower = upper;
                upper = prevX;
            }
            n++;
        }
        System.out.println("No root found!");
        return -1;
    }
}
