package lastterm.year2223.de1.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
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
        arrayPolynomial1.append(-1.4);
        arrayPolynomial1.append(2.6);
        arrayPolynomial1.append(3.6);
        arrayPolynomial1.append(5.6);
        arrayPolynomial1.append(2.5);
        arrayPolynomial1.insert(1.5, 5);
        arrayPolynomial1.insert(3.7, 3);
        arrayPolynomial1.insert(1.5, 0);

        System.out.println("\nPoly1:");
        System.out.println(arrayPolynomial1);

        System.out.println("\nValue at x = 5:");
        System.out.println(arrayPolynomial1.evaluate(5));

        System.out.println("\nSet coefficient at index 1 from 2.6 to 3.9");
        arrayPolynomial1.set(3.9, 1);
        System.out.println(arrayPolynomial1);

        System.out.println("\nRemove coefficient at index 3:");
        arrayPolynomial1.remove(3);
        System.out.println(arrayPolynomial1);

        System.out.println("\nDerivative:");
        arrayPolynomial1.derivative();
        System.out.println(arrayPolynomial1);

        ArrayPolynomial arrayPolynomial2 = new ArrayPolynomial();
        arrayPolynomial2.append(1.5);
        arrayPolynomial2.append(2.6);
        arrayPolynomial2.append(3.7);
        arrayPolynomial2.append(4.5);

        System.out.println("\nPoly2:");
        System.out.println(arrayPolynomial2);

        System.out.println("\nValue at x = 3:");
        System.out.println(arrayPolynomial2.evaluate(3));

        System.out.println("\nSet coefficient at index 2 from 3.7 to 3.9");
        arrayPolynomial2.set(3.9, 2);
        System.out.println(arrayPolynomial2);

        System.out.println("\nRemove coefficient at index 1:");
        arrayPolynomial2.remove(1);
        System.out.println(arrayPolynomial2);

        System.out.println("\nDerivative:");
        arrayPolynomial2.derivative();
        System.out.println(arrayPolynomial2);

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
        listPolynomial1.append(-1.4);
        listPolynomial1.append(2.6);
        listPolynomial1.append(3.6);
        listPolynomial1.append(5.6);
        listPolynomial1.append(2.5);
        listPolynomial1.insert(1.5, 5);
        listPolynomial1.insert(3.7, 3);
        listPolynomial1.insert(1.5, 0);


        System.out.println("\nPoly1:");
        System.out.println(listPolynomial1);

        System.out.println("\nValue at x = 5");
        System.out.println(listPolynomial1.evaluate(5));

        System.out.println("\nSet coefficient at index 1 from 2.6 to 3.9");
        listPolynomial1.set(3.9, 1);
        System.out.println(listPolynomial1);

        System.out.println("\nRemove coefficient at index 3:");
        listPolynomial1.remove(3);
        System.out.println(listPolynomial1);

        System.out.println("\nDerivative:");
        listPolynomial1.derivative();
        System.out.println(listPolynomial1);


        ListPolynomial listPolynomial2 = new ListPolynomial();
        listPolynomial2.append(1.5);
        listPolynomial2.append(2.6);
        listPolynomial2.append(3.7);
        listPolynomial2.append(4.5);

        System.out.println("\nPoly2:");
        System.out.println(listPolynomial2);

        System.out.println("\nValue at x = 3");
        System.out.println(listPolynomial2.evaluate(3));

        System.out.println("\nSet coefficient at index 2 from 3.7 to 3.9");
        listPolynomial2.set(3.9, 2);
        System.out.println(listPolynomial2);

        System.out.println("\nRemove coefficient at index 1:");
        listPolynomial2.remove(1);
        System.out.println(listPolynomial2);

        System.out.println("\nDerivative:");
        listPolynomial2.derivative();
        System.out.println(listPolynomial2);

        System.out.println("\nMultiply:");
        System.out.println(listPolynomial1.multiply(listPolynomial2));

        System.out.println("\nSum:");
        System.out.println(listPolynomial1.plus(listPolynomial2));

        System.out.println("\nMinus:");
        System.out.println(listPolynomial1.minus(listPolynomial2));
        System.out.println();

    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */


        ArrayPolynomial arrayPolynomial = new ArrayPolynomial();
        arrayPolynomial.append(1.9);
        arrayPolynomial.append(-2.6);
        arrayPolynomial.append(3.9);
        arrayPolynomial.append(-6.7);
        arrayPolynomial.append(8.5);
        System.out.println("\nPolynomial:");
        System.out.println(arrayPolynomial);

        IntegrationCalculator integrationCalculator = new IntegrationCalculator(arrayPolynomial);
        TrapezoidRule trapezoidRule = new TrapezoidRule(0.0001, 1000);
        integrationCalculator.setIntegrator(trapezoidRule);
        System.out.println("\nTrapezoidRule: " + integrationCalculator.integrate(2.0, 3.0));

        MidpointRule midpointRule = new MidpointRule(0.00001, 1000);
        integrationCalculator.setIntegrator(midpointRule);
        System.out.println("\nMidpointRule: " + integrationCalculator.integrate(2.0, 3.0));

        SimpsonRule simpsonRule = new SimpsonRule(0.0001, 1000);
        integrationCalculator.setIntegrator(simpsonRule);
        System.out.println("\nSimpsonRule: " + integrationCalculator.integrate(2.0, 3.0));
    }
}
