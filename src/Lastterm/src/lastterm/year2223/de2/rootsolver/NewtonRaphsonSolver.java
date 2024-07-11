package lastterm.year2223.de2.rootsolver;

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
     * Tìm nghiệm của hàm một biến sử dụng phương pháp Newton-Raphson.
     * @param function
     * @param lower
     * @param upper
     * @return nghiệm của hàm.
     */
    @Override
    public double solve(AbstractFunction function, double lower, double upper) {
        /* TODO */
        int num = 0;
        double prevX = (upper + lower) / 2;
        double curX = prevX - (function.evaluate(prevX) / function.derivative(prevX));
        if (function.evaluate(prevX) == 0){
            return prevX;
        }
        while (num <= maxIterations){
            if (function.evaluate(curX) == 0 || Math.abs(curX - prevX) < tolerance){
                return curX;
            } else {
                prevX = curX;
                curX = prevX - (function.evaluate(prevX) / function.derivative(prevX));
            }
            num++;
        }
        System.out.println("No root found:");
        return -1;
    }
}
