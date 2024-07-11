package midterm.year2324.polynomial;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức sử dụng phương pháp Newton-Raphson.
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        int num = 0;
        double prevX = (upper + lower) / 2;
        double curX = prevX - (polynomial.evaluate(prevX) / polynomial.derivative().evaluate(prevX));
        if (polynomial.evaluate(prevX) == 0){
            return prevX;
        }
        while (num <= maxIterations){
            if (polynomial.evaluate(curX) == 0 || Math.abs(curX - prevX) < tolerance){
                return curX;
            } else {
                prevX = curX;
                curX = prevX - (polynomial.evaluate(prevX) / polynomial.derivative().evaluate(prevX));
            }
        }
        System.out.println("No root found:");
        return -1;
    }
}
