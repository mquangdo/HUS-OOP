package OOP2022_2023.polynomial;

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
        //solve by Newton-Raphson method
        double x0 = (lower + upper) / 2;
        double x1 = x0 - polynomial.evaluate(x0) / polynomial.derivative().evaluate(x0);
        while (Math.abs(x1 - x0) >= tolerance){
            x0 = x1;
            x1 = x0 - polynomial.evaluate(x0) / polynomial.derivative().evaluate(x0);
        }
        return x1;
    }
}
