package week10;
import java.util.Arrays;
import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {

    }
    public static boolean ColCompare(int[][] a, int l, int k){
        int m = a.length;
        int n = a[0].length;
        for (int i = 0; i < m; i++){
            if (a[i][l] != a[i][k]){
                return false;

            }
        }
        return true;
    }
}
