package hus.oop.lab05;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial poly1 = new MyPolynomial(1,1,1);
        MyPolynomial poly2 = new MyPolynomial(1,3,5);
        System.out.println(poly1);
        System.out.println(poly2);
        System.out.println("The value of poly1 at 0.5 is: " + poly1.evaluate(0.5));
        System.out.println("The sum of poly1 and poly2 is: " + poly1.add(poly2));
        System.out.println("The multiply of poly1 and poly2 is: " + poly1.multiply(poly2));
    }
}
