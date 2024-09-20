package week8;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2,3}, {1, 3,3},{4, 6,5}};
        int[][] b = {{3, 4}, {4, 5}, {6,7}};
        int[][] d = {{1,2}, {2,3}};
//        int[][] c = SumMatrix(a, b);
//        printMatrix(c);
        printMatrix(a);
//        System.out.println();
//        printMatrix(transpose(a));
//        System.out.println(ColSum(a, 0));
////        printArray(ArrColSum(a));
//        System.out.println();
//        printMatrix(prodMatrix(a, d));
        printMatrix(delCol(a, 1));
    }

    public static int[][] SumMatrix(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int[][] c = new int[m][n];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] a){
        int m = a.length;
        int n = a[0].length;
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    public static int ColSum(int[][] a, int k){
        int m = a.length;;
        int n = a[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (j == k){
                    sum = sum + a[i][j];
                }
            }
        }
        return sum;
    }
    public static int[] ArrColSum(int[][] a){
        int[] l = new int[a[0].length];
        for (int i = 0; i < a[0].length; i++){
            l[i] = ColSum(a, i);
        }
        return l;
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static int[][] prodMatrix(int[][] a, int[][] b){
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;
        int[][] c = new int[m][p];
        for (int i = 0; i < m; i++){
            for(int k = 0; k < p; k++){
                c[i][k] = 0;
                for(int j = 0; j < n; j++){
                    c[i][k] += a[i][j] * b[j][k];
                }
            }
        }
        return c;
    }
    public static int[][] delCol(int[][] a, int k){
        int m = a.length;
        int n = a[0].length;
        int[][] b = new int[m][n - 1];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < k; j++){
                a[i][j] = a[i][j];
            }
            for (int j = k + 1; j < n - 1; j++){
                a[i][j] = a[i][j];
            }
        }
        return a;
    }
}