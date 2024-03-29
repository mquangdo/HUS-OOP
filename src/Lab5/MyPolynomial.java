package Lab5;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeff) {
        double[] coeffs = new double[coeff.length];
        System.arraycopy(coeff, 0, coeffs, 0, coeff.length);
        this.coeffs = coeffs;
    }

    public static void main(String[] args) {
        MyPolynomial poly = new MyPolynomial(1, 2, 2.5,0);
        System.out.println(Arrays.toString(poly.coeffs));
        System.out.println(poly);
        System.out.println(poly.evaluate(1));
        int[] a1 = {1, 4, 1};
        int[] a2 = {1, 3, 1};
        MyPolynomial poly1 = new MyPolynomial(1, 3, 1);
        MyPolynomial poly2 = new MyPolynomial(1, 4, 1);
        MyPolynomial res = poly1.multiply(poly2);
        System.out.println(res);
    }

    public static int[] multiply(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length - 1];
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                res[i + j] += a1[i] * a2[j];
            }
        }
        return res;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public double[] getCoeffs() {
        return this.coeffs;
    }

    public String toString() {
        String res = "";
        for (int i = 0; i < this.coeffs.length; i++) {
            if (this.coeffs[i] != 0){
                if (i == 1){
                    res = " + " + this.coeffs[i] + "x" + res;
                } else if (i == 0){
                    res = " + " + this.coeffs[i] + res;
                } else if (i == this.coeffs.length - 1){
                    res =  this.coeffs[i] + "x^" + i + res;
                } else {
                    res = " + " + this.coeffs[i] + "x^" + i + res;
                }
            }
        }
        return res.trim();
    }

    public double evaluate(double x) {
        double res = 0;
        for (int i = this.coeffs.length - 1; i >= 0; i--) {
            res = x * res + this.coeffs[i];
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxlength = Math.max(this.coeffs.length, right.coeffs.length);
        double [] newThisCoef = new double[maxlength];
        double [] newRigthCoef = new double[maxlength];
        for (int i = 0; i < this.coeffs.length; i++){
            newThisCoef[i] = this.coeffs[i];
        }
        for (int i = 0; i < right.coeffs.length; i++){
            newRigthCoef[i] = right.coeffs[i];
        }
        for (int i = 0; i < newThisCoef.length; i++){
            newThisCoef[i] += newRigthCoef[i];
        }
        this.coeffs = newThisCoef;
        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] coef1 = this.coeffs;
        double[] coef2 = right.getCoeffs();
        double[] result = new double[this.coeffs.length + right.getCoeffs().length - 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.getCoeffs().length; j++) {
                result[result.length - 1 - (i + j)] += coef1[i] * coef2[j];
            }
        }
        this.coeffs = result;
        return this;
    }
}
