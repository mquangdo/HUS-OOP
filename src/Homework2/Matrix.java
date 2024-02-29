package Homework2;

import com.sun.source.tree.BreakTree;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrixA = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrixB = {{2,3,2},{5,5,6},{1,1,1}};
        int[][] matrixD = add(matrixA, matrixB);
        int[][] matrixC = multipyly(matrixA, matrixB);
        print(matrixC);
        System.out.println();
        print(matrixD);
    }

    public static void print(int[][] matrix){
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        for (int row = 0; row < rowNum; row++){
            for (int col = 0; col < colNum; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix){
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        for (int row = 0; row < rowNum; row++){
            for (int col = 0; col < colNum; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2){
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2){
        if (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++){
            for (int col = 0; col < matrix1[0].length; col++){
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++){
            for (int col = 0; col < matrix1[0].length; col++){
                result[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++){
            for (int col = 0; col < matrix1[0].length; col++){
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++){
            for (int col = 0; col < matrix1[0].length; col++){
                result[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] multipyly(int[][] matrix1, int[][] matrix2){
        int[][] res = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < res.length; i++){
            for (int k = 0; k < res[0].length; k++){
                int value = 0;
                for (int j = 1; j < res.length; j++){
                    value += matrix1[i][j] * matrix2[j][k];
                }
                res[i][k] = value;
            }
        }
        return res;
    }

    public static double[][] multipyly(double[][] matrix1, double[][] matrix2){
        double[][] res = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < res.length; i++){
            for (int k = 0; k < res[0].length; k++){
                double value = 0;
                for (int j = 1; j < res.length; j++){
                    value += matrix1[i][j] * matrix2[j][k];
                }
                res[i][k] = value;
            }
        }
        return res;
    }

}
