package lastterm.year2324.rootsolver;

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
     * Tìm nghiệm của hàm một biến theo phương pháp chia đôi (Bisection)
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        int numOfIterations = 0;
        while (numOfIterations <= maxIterations) {
            double c = (lower + upper) / 2;
            if (function.evaluate(c) == 0 || (upper - lower) / 2 < tolerance) {
                return c;
            } else {
                if (function.evaluate(c) * function.evaluate(lower) > 0) {
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
