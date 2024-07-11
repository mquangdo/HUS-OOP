package lastterm.year2223.de1.integration;

public class TrapezoidRule implements Integrator {
    private double precision;
    private int maxIterations;

    public TrapezoidRule(double precision, int maxIterations) {
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

        //
//        while (error >= precision && numIterations < maxIterations){
//            prevResult = currentResult;
//            numOfSubIntervals *= 2;
//            currentResult = integrate(poly, lower, upper, numOfSubIntervals);
//            error = Math.abs(currentResult - prevResult) / 3;
//            numIterations++;
//        }
//
//        return currentResultl;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double res = 0.0;
        double deltaX = (upper - lower) / numOfSubIntervals;
        for (int i = 0; i <= numOfSubIntervals; i++){
            if (i == 0){
                res += poly.evaluate(lower);
            } else if (i == numOfSubIntervals){
                res += poly.evaluate(upper);
            } else {
                res += 2 * poly.evaluate(lower + i * deltaX);
            }
        }
        return res * deltaX / 2;
    }
}
