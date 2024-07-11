package midterm.year2223.de3.polynomial;

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
        int numOfIterations = 0;
        while (numOfIterations <= maxIterations) {
            double c = (lower + upper) / 2;
            if (polynomial.evaluate(c) == 0 || (upper - lower) / 2 < tolerance) {
                return c;
            } else {
                if (polynomial.evaluate(c) * polynomial.evaluate(lower) > 0) {
                    lower = c;
                } else {
                    upper = c;
                }
            }
            numOfIterations++;
        }
        System.out.println("No root found!");
        return -1;
    }
}
