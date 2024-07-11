package lastterm.year2223.de1.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int numOfSubIntervals = 1000;
        double prevResult = 0;
        double currentResult = integrate(poly, lower, upper, numOfSubIntervals);
        double error = Math.abs(currentResult - prevResult) / 3;
        int numIterations = 0;

        while (error >= precision && numIterations <= maxIterations) {
            prevResult = currentResult;
            numOfSubIntervals *= 2;
            currentResult = integrate(poly, lower, upper, numOfSubIntervals);
            error = Math.abs(currentResult - prevResult) / 3;
            numIterations++;
        }

        return currentResult;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double res = 0;
        double deltaX = (upper - lower) / numOfSubIntervals;
        for (int i = 1; i < numOfSubIntervals; i++){
            if (i % 2 == 1){
                res += 4 * poly.evaluate(lower + i * deltaX);
            } else {
                res += 2 * poly.evaluate(lower + i * deltaX);
            }
        }
        res += poly.evaluate(lower) + poly.evaluate(upper);
        return res * deltaX / 3;
    }
}
