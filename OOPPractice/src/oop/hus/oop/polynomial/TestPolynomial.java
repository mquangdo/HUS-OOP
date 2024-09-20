package oop.hus.oop.polynomial;

import OOP2022_2023.polynomial.ArrayPolynomial;

import java.util.Arrays;

public class TestPolynomial {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyPolynomial>.txt
           (ví dụ, NguyenVanA_123456_MyPolynomial.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        System.out.println("List polynomial: ");
        testListPolynomial();
        System.out.println();
        System.out.println("Array polynomial: ");
        testArrayPolynomial();
    }

    public static void testArrayPolynomial() {
        /*
         TODO


         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        OOP2022_2023.polynomial.ArrayPolynomial p = new ArrayPolynomial();
        p.append(1).append(2).append(3);
        System.out.println(p.toString()); // Expect: [1.0 + 2.0x + 3.0x^2]

        // Test insert
        p.insert(4, 1);
        System.out.println(p.toString()); // Expect: [1.0 + 4.0x + 2.0x^2 + 3.0x^3]

        // Test coefficient
        System.out.println(p.coefficient(2)); // Expect: 2.0

        // Test coefficients
        System.out.println(Arrays.toString(p.coefficients())); // Expect: [1.0, 4.0, 2.0, 3.0]

        // Test evaluate
        System.out.println(p.evaluate(2)); // Expect: 49.0

        // Test derivative
        System.out.println(Arrays.toString(p.derivative().coefficients()));

    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        // Test append
        OOP2022_2023.polynomial.ListPolynomial p = new OOP2022_2023.polynomial.ListPolynomial();
        p.append(1).append(2).append(3);
        System.out.println(p.toString()); // Expect: [1.0 + 2.0x + 3.0x^2]

        // Test insert
        p.insert(4, 1);
        System.out.println(p.toString()); // Expect: [1.0 + 4.0x + 2.0x^2 + 3.0x^3]

        // Test set
        p.set(5, 2);
        System.out.println(p.toString()); // Expect: [1.0 + 4.0x + 5.0x^2 + 3.0x^3]

        // Test coefficient
        System.out.println(p.coefficient(2)); // Expect: 5.0

        // Test coefficients
        System.out.println(Arrays.toString(p.coefficients())); // Expect: [1.0, 4.0, 5.0, 3.0]

        // Test evaluate
        System.out.println(p.evaluate(2)); // Expect: 49.0

        // Test derivative
        System.out.println(Arrays.toString(p.derivative().coefficients())); // Expect: [4.0, 10.0, 9.0]

    }

    public static void testRootSolver() {
        /*
         TODO

         - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
         - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
         */
    }
}
