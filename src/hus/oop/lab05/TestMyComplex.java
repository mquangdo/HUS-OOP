package hus.oop.lab05;

public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex complex = new MyComplex(1,0);
        MyComplex complex1 = new MyComplex(2,2);
        if (complex.isReal()) {
            System.out.println(complex + " is pure real number");
        } else if (complex.isImaginary()) {
            System.out.println(complex + " is pure imaginary number");
        } else {
            System.out.println(complex + " is NOT a pure real number");
            System.out.println(complex + " is NOT a pure imaginary number");
        }
        MyComplex.testAdd(complex1, complex);
        MyComplex.testEquals(complex1, complex);

        MyComplex multiply = complex.multiply(complex1);
        System.out.println(multiply);

        MyComplex divided = complex.divide(complex1);
        System.out.println(divided);
    }
}
