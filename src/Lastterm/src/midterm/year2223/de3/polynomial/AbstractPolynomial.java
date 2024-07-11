package midterm.year2223.de3.polynomial;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO *
         */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        if (coefficients()[0] > 0){
            stringBuilder.append(coefficients()[0]);
        } else if (coefficients()[0] < 0) {
            stringBuilder.append("-").append(- coefficients()[0]);
        }
        if (coefficients()[1] > 0){
            stringBuilder.append(" + ").append(coefficients()[1]).append("x");
        } else if (coefficients()[1] < 0){
            stringBuilder.append(" - ").append(- coefficients()[1]).append("x");
        }
        for (int i = 2; i < coefficients().length; i++){
            if (coefficients()[i] != 0){
                if (coefficients()[i] > 0){
                    stringBuilder.append(" + ").append(coefficients()[i]).append("x^").append(i);
                }else if (coefficients()[i] < 0){
                    stringBuilder.append(" - ").append(- coefficients()[i]).append("x^").append(i);
                }
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] differ = new double[coefficients().length - 1];
        for (int i = 0; i < differ.length; i++){
            differ[i] = coefficients()[i + 1] * (i + 1);
        }
        return differ;
    }

    public void checkIndex(int index, int limit){
        if (index < 0 || index > limit){
            throw new ArrayIndexOutOfBoundsException();
        }
        return;
    }
}
