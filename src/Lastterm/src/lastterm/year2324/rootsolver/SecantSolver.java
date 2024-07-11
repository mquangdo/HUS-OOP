package lastterm.year2324.rootsolver;

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
     * Tìm nghiệm của hàm một biến theo phương pháp Secant
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm trong đoạn [lower, upper]
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        int n = 0;
        double prevX = 0;
        while (n <= maxIterations){
            double x = upper - function.evaluate(upper) * (upper - lower) / (function.evaluate(upper) - function.evaluate(lower));
            if (function.evaluate(x) == 0 || x - prevX < tolerance){
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
