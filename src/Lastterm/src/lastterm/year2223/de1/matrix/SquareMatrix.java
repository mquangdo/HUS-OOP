package lastterm.year2223.de1.matrix;

import java.util.Arrays;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     *
     * @param size
     */
    private void initRandom(int size) {
        /* TODO */
        data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                set(i, j, (int) (Math.random() * 99 + 1));
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     *
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        /* TODO */
        int[] diag = new int[data.length];
        for (int i = 0; i < diag.length; i++) {
            diag[i] = get(i, i);
        }
        return diag;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     *
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        /* TODO */
        int[] diag = new int[data.length];
        for (int i = 0; i < diag.length; i++) {
            diag[i] = get(data.length - 1 - i, i);
        }
        return diag;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     *
     * @return các số nguyên tố trong ma trận.
     */
    public int[] primes() {
        /* TODO */
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (isPrime(get(i, j))) {
                    count++;
                }
            }
        }
        int[] prime = new int[count];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (isPrime(get(i, j))) {
                    prime[i] = get(i, j);
                }
            }
        }
        return prime;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     *
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        /* TODO */
        int[][] sorted = new int[data.length][data.length];
        int[] temp = new int[data.length * data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                temp[j + i * data.length] = get(i, j);
            }
        }

        Arrays.sort(temp);

        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                sorted[i][j] = temp[j + i * sorted.length];
            }
        }

        SquareMatrix squareMatrix = new SquareMatrix(data.length);
        squareMatrix.data = sorted;
        return squareMatrix;
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     *
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        /* TODO */
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     *
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        /* TODO */
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        /* TODO */
        SquareMatrix sumMatrix = new SquareMatrix(data.length);
        int[][] sum = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                sum[i][j] = this.get(i, j) + that.get(i, j);
            }
        }
        sumMatrix.data = sum;
        return sumMatrix;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        /* TODO */
        SquareMatrix minusMatrix = new SquareMatrix(data.length);
        int[][] minus = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                minus[i][j] = this.get(i, j) - that.get(i, j);
            }
        }
        minusMatrix.data = minus;
        return minusMatrix;
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     *
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        /* TODO */
        int[][] multi = new int[data.length][that.data[0].length];
        for (int i = 0; i < multi.length; i++) {
            for (int k = 0; k < multi[0].length; k++) {
                int sum = 0;
                for (int j = 0; j < data[0].length; j++) {
                    sum += this.get(i, j) * that.get(j, k);
                }
                multi[i][k] = sum;
            }
        }
        SquareMatrix squareMatrix = new SquareMatrix(data.length);
        squareMatrix.data = multi;
        return squareMatrix;
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     *
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        /* TODO */
        SquareMatrix scaledMatrix = new SquareMatrix(data.length);
        int[][] scaled = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                scaled[i][j] = this.get(i, j) * value;
            }
        }
        scaledMatrix.data = scaled;
        return scaledMatrix;
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     *
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        /* TODO */
        SquareMatrix transposeMatrix = new SquareMatrix(data.length);
        int[][] transpose = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                transpose[i][j] = get(j, i);
            }
        }
        transposeMatrix.data = transpose;
        return transposeMatrix;
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     * 1 2 3
     * 4 5 6
     * 7 8 9
     *
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                stringBuilder.append(get(i, j)).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
