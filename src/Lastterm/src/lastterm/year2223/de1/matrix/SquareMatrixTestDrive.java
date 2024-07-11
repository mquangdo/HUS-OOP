package lastterm.year2223.de1.matrix;

import java.util.Arrays;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
        int num = (int)(Math.random() * 5 + 5);
        SquareMatrix mat1 = new SquareMatrix(num);
        SquareMatrix mat2 = new SquareMatrix(num);

        System.out.println("\nThe first matrix:");
        System.out.println(mat1);

        System.out.println("\nTranspose:");
        System.out.println(mat1.transpose());

        System.out.println("\nPrincipal diagonal:");
        System.out.println(Arrays.toString(mat1.primes()));

        System.out.println("\nSecondary diagonal:");
        System.out.println(Arrays.toString(mat1.secondaryDiagonal()));

        System.out.println("\nPrimes:");
        System.out.println(Arrays.toString(mat1.primes()));

        System.out.println("\nThe second matrix:");
        System.out.println(mat2);

        System.out.println("\nTranspose:");
        System.out.println(mat2.transpose());

        System.out.println("\nPrincipal diagonal:");
        System.out.println(Arrays.toString(mat2.primes()));

        System.out.println("\nSecondary diagonal:");
        System.out.println(Arrays.toString(mat2.secondaryDiagonal()));

        System.out.println("\nPrimes:");
        System.out.println(Arrays.toString(mat2.primes()));

        System.out.println("\nSum of 2 matrix:");
        System.out.println(mat1.add(mat1));

        System.out.println("\n1st matrix minus 2nd matrix:");
        System.out.println(mat1.minus(mat2));

        System.out.println("\nMultiply:");
        System.out.println(mat1.multiply(mat2));

        System.out.println("\nSorted matrix of 1st matrix:");
        System.out.println(mat1.getSortedMatrix());
    }
}
