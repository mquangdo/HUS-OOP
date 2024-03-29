package Lab5;

import java.util.Scanner;

public class MyComplex {
    static Scanner in = new Scanner(System.in);
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void testMyComplex() {
        System.out.print("Enter complex number1 (real and imaginary): ");
        MyComplex complex1 = generateComplex(in);
        System.out.print("Enter complex number2 (real and imaginary): ");
        MyComplex complex2 = generateComplex(in);

        System.out.print("Number 1 is: " + complex1);
        testRealAndImaginaryPart(complex1);

        System.out.print("Number 2 is: " + complex2);
        testRealAndImaginaryPart(complex2);

        testAdd(complex1, complex2);

    }

    public static MyComplex generateComplex(Scanner in) {
        double real;
        double image;

        real = in.nextDouble();
        image = in.nextDouble();

        return new MyComplex(real, image);
    }

    public static void testRealAndImaginaryPart(MyComplex complex) {
        if (complex.isReal()) {
            System.out.println(complex + " is pure real number");
        } else if (complex.isImaginary()) {
            System.out.println(complex + " is pure imaginary number");
        } else {
            System.out.println(complex + " is NOT a pure real number");
            System.out.println(complex + " is NOT a pure imaginary number");
        }
    }

    public static void testEquals(MyComplex complex1, MyComplex complex2) {
        if (!complex1.equals(complex1)) {
            System.out.println(complex1 + " is NOT equals " + complex2);
        } else {
            System.out.println(complex1 + " is equals " + complex2);
        }
    }

    public static void testAdd(MyComplex complex1, MyComplex complex2) {
        MyComplex complex3 = complex1.addNew(complex2);
        System.out.print(complex1 + " + " + complex2 + " = " + complex3);
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + this.real + this.imag + "i)";
    }

    public boolean isReal() {
        return this.imag == 0;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public boolean isImaginary() {
        return this.real == 0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return another.getReal() == this.real && another.getImag() == this.imag;
    }

    public double magnitude() {
        double moduleSquared = this.real * this.real + this.imag * this.imag;
        return Math.sqrt(moduleSquared);
    }

    public MyComplex addNew(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return new MyComplex(this.real, this.imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    public MyComplex multiply(MyComplex right) {
        double real = this.real * right.real - this.imag * right.imag;
        double imag = this.real * right.imag + this.imag * right.real;
        this.real = real;
        this.imag = imag;
        return this;
    }
    public MyComplex divide(MyComplex right) {
        double real = (this.real * right.real + this.imag * right.imag) / (right.real * right.real + right.imag * right.imag);
        double imag = (this.imag * right.real - this.real * right.imag) / (right.real * right.real + right.imag * right.imag);
        this.real = real;
        this.imag = imag;
        return this;
    }
}
