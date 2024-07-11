package lastterm.year2223.de2.rootsolver;

public class RootFindingTestDrive {
    public static void main(String[] args) {
        /*
        TODO

        Chạy các hàm test để test chương trình.
        Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_RootFinding>.txt
        (ví dụ, NguyenVanA_123456_RootFinding.txt).
        Nén tất cả các file source code và file kết quả chạy chương trình vào file zip có tên
        <TenSinhVien_MaSinhVien_RootFinding>.zip (ví dụ, NguyenVanA_123456_RootFinding.txt), và nộp bài
        lên classroom.
        */
        testRootSolver();
    }

    public static void testRootSolver() {
        /*
         TODO

         - Viết chương trình tìm nghiệm của hàm (sin(x).x - 3) theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           UnivariateRealRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, hàm và nghiệm của hàm tìm được.
         */
        UnivariateRealFunction function = new UnivariateRealFunction();
        UnivariateRealRootFinding realRootFinding = new UnivariateRealRootFinding(function);

        System.out.println("Function: x * sin(x) - 3");
        System.out.println("Close interval: [12,14]");

        System.out.println("\nUsing Bisection method:");
        System.out.println("Tolerance: 0.0001");
        System.out.println("Max iterations: 10000");
        BisectionSolver bisectionSolver = new BisectionSolver(0.00001, 10000);
        realRootFinding.setRootSolver(bisectionSolver);
        System.out.println("The root is: " + realRootFinding.solve(12,14));

        System.out.println("\nUsing Secant method:");
        System.out.println("Tolerance: 0.0001");
        System.out.println("Max iterations: 10000");
        SecantSolver secantSolver = new SecantSolver(0.0001,10000);
        realRootFinding.setRootSolver(secantSolver);
        System.out.println("The root is: " + realRootFinding.solve(12, 14));

        System.out.println("\nUsing Newton-Raphson method:");
        System.out.println("Tolerance: 0.0001");
        System.out.println("Max iterations: 10000");
        NewtonRaphsonSolver newtonRaphsonSolver = new NewtonRaphsonSolver(0.0001, 10000);
        realRootFinding.setRootSolver(newtonRaphsonSolver);
        System.out.println("The root is: " + realRootFinding.solve(12,14));
    }
}
