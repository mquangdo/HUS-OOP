package midterm.year2324.polynomial;

public class TestPolynomial {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyPolynomial>.txt
           (ví dụ, NguyenVanA_123456_MyPolynomial.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testRootSolver();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        System.out.println("\nTest ArrayPolynomial:");
        ArrayPolynomial arrayPolynomial1 = new ArrayPolynomial();
        arrayPolynomial1.insertAtEnd(-1.4);
        arrayPolynomial1.insertAtEnd(2.6);
        arrayPolynomial1.insertAtEnd(3.6);
        arrayPolynomial1.insertAtEnd(5.6);
        arrayPolynomial1.insertAtEnd(2.5);
        arrayPolynomial1.insertAtPosition(5, 1.5);
        arrayPolynomial1.insertAtPosition(3, 3.7);
        arrayPolynomial1.insertAtPosition(0, 1.5);

        System.out.println("\nPoly1:");
        System.out.println(arrayPolynomial1);

        System.out.println("\nValue at x = 5:");
        System.out.println(arrayPolynomial1.evaluate(5));

        System.out.println("\nSet coefficient at index 1 from 2.6 to 3.9");
        arrayPolynomial1.set(1, 3.9);
        System.out.println(arrayPolynomial1);

        System.out.println("\nRemove coefficient at index 3:");
        arrayPolynomial1.remove(3);
        System.out.println(arrayPolynomial1);

        System.out.println("\nDerivative:");
        System.out.println(arrayPolynomial1.derivative());

        ArrayPolynomial arrayPolynomial2 = new ArrayPolynomial();
        arrayPolynomial2.insertAtEnd(1.5);
        arrayPolynomial2.insertAtEnd(2.6);
        arrayPolynomial2.insertAtEnd(3.7);
        arrayPolynomial2.insertAtEnd(4.5);

        System.out.println("\nPoly2:");
        System.out.println(arrayPolynomial2);

        System.out.println("\nValue at x = 3:");
        System.out.println(arrayPolynomial2.evaluate(3));

        System.out.println("\nSet coefficient at index 2 from 3.7 to 3.9");
        arrayPolynomial2.set(2,3.9);
        System.out.println(arrayPolynomial2);

        System.out.println("\nRemove coefficient at index 1:");
        arrayPolynomial2.remove(1);
        System.out.println(arrayPolynomial2);

        System.out.println("\nDerivative:");
        System.out.println(arrayPolynomial2.derivative());

        System.out.println("\nMultiply:");
        System.out.println(arrayPolynomial1.multiply(arrayPolynomial2));

        System.out.println("\nSum:");
        System.out.println(arrayPolynomial1.plus(arrayPolynomial2));

        System.out.println("\nMinus:");
        System.out.println(arrayPolynomial1.minus(arrayPolynomial2));
        System.out.println();
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        System.out.println("\nTest ListPolynomial:");
        ListPolynomial listPolynomial1 = new ListPolynomial();
        listPolynomial1.insertAtEnd(-1.4);
        listPolynomial1.insertAtEnd(2.6);
        listPolynomial1.insertAtEnd(3.6);
        listPolynomial1.insertAtEnd(5.6);
        listPolynomial1.insertAtEnd(2.5);
        listPolynomial1.insertAtPosition(5, 1.5);
        listPolynomial1.insertAtPosition(3, 3.7);
        listPolynomial1.insertAtPosition(0, 1.5);


        System.out.println("\nPoly1:");
        System.out.println(listPolynomial1);

        System.out.println("\nValue at x = 5");
        System.out.println(listPolynomial1.evaluate(5));

        System.out.println("\nSet coefficient at index 1 from 2.6 to 3.9");
        listPolynomial1.set(1, 3.9);
        System.out.println(listPolynomial1);

        System.out.println("\nRemove coefficient at index 3:");
        listPolynomial1.remove(3);
        System.out.println(listPolynomial1);

        System.out.println("\nDerivative:");
        System.out.println(listPolynomial1.derivative());


        ListPolynomial listPolynomial2 = new ListPolynomial();
        listPolynomial2.insertAtEnd(1.5);
        listPolynomial2.insertAtEnd(2.6);
        listPolynomial2.insertAtEnd(3.7);
        listPolynomial2.insertAtEnd(4.5);

        System.out.println("\nPoly2:");
        System.out.println(listPolynomial2);

        System.out.println("\nValue at x = 3");
        System.out.println(listPolynomial2.evaluate(3));

        System.out.println("\nSet coefficient at index 2 from 3.7 to 3.9");
        listPolynomial2.set(2, 3.9);
        System.out.println(listPolynomial2);

        System.out.println("\nRemove coefficient at index 1:");
        listPolynomial2.remove(1);
        System.out.println(listPolynomial2);

        System.out.println("\nDerivative:");
        System.out.println(listPolynomial2.derivative());

        System.out.println("\nMultiply:");
        System.out.println(listPolynomial1.multiply(listPolynomial2));

        System.out.println("\nSum:");
        System.out.println(listPolynomial1.plus(listPolynomial2));

        System.out.println("\nMinus:");
        System.out.println(listPolynomial1.minus(listPolynomial2));
        System.out.println();
    }

    public static void testRootSolver() {
        /*
         TODO

         - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
         - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
         */
        ArrayPolynomial arrayPolynomial = new ArrayPolynomial();
        arrayPolynomial.insertAtEnd(1);
        arrayPolynomial.insertAtEnd(3);
        arrayPolynomial.insertAtEnd(2);
        arrayPolynomial.insertAtEnd(1);
        System.out.println();
        System.out.println("\nOriginal polynomial:");
        System.out.println(arrayPolynomial);
        System.out.println("\nFind root on interval [-5,5]:");

        BisectionSolver bisectionSolver = new BisectionSolver(0.0001, 1000);
        PolynomialRootFinding rootFinding = new PolynomialRootFinding(arrayPolynomial, bisectionSolver);
        System.out.println("\nUsing Bisection method:");
        System.out.println("Root is: " + rootFinding.solve(-5,5));

        SecantSolver secantSolver = new SecantSolver(0.0001, 1000);
        rootFinding.setRootSolver(secantSolver);
        System.out.println("\nUsing Secant method:");
        System.out.println("Root is: " + rootFinding.solve(-5,5));

        NewtonRaphsonSolver newtonRaphsonSolver = new NewtonRaphsonSolver(0.0001, 1000);
        rootFinding.setRootSolver(newtonRaphsonSolver);
        System.out.println("\nUsing Newton-Raphson method:");
        System.out.println("Root is: " + rootFinding.solve(-5,5));
    }
}
