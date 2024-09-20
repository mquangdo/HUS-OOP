package Midterm;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {3, 4, 4, 5, 3, 6};
        int k = 3;
        printArray(findSubArray(a, 3));
//        int[] b = {2,4,2,3,3};
//        System.out.println(majorityElement(b));

    }

    public static int[] inputArray(Scanner sc){
        int m = sc.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < m; i++){
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static boolean hasArrayTwoCandidate(int[] a, int x){
        int n = a.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = i + 1; j < n; j++){
                if (a[i] + a[j] == x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static int[] findSubArray(int[] a, int k){
        int n = a.length;
        int min = Integer.MAX_VALUE;
        int[] b = new int[k];
        for (int i = 0; i < n - k + 1; i++){
            int sum = 0;
            for (int j = i; j < i + k; j++){
                sum += a[j];
            }
            if (sum < min){
                min = sum;
            }
        }
        for (int i = 0; i < n - k + 1; i++){
            int sum = 0;
            for (int j = i; j < i + k; j++){
                sum += a[j];
            }
            if(sum == min){
                for (int j = i; j < i + k; j++){
                    b[j] = a[j];
                }
            }
        }
        return b;
    }

    public static boolean count(int[] a, int x){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == x){
                count += 1;
            }
        }
        if (count > a.length / 2){
            return true;
        }
        else {
            return false;
        }

    }

    public static int majorityElement(int[] a){
        int check = -1;
        for (int i = 0;i < a.length; i++){
            if (count(a, a[i])){
                if (i < check){
                    check = i;
                }
            }
        }
        return check;
    }

    public static int findIndex(int[] a){
        for (int i = 0; i < a.length; i++){
            int sum1 = 0;
            int sum2 = 0;
            int min = -1;
            for (int j = 0; j < i; j++){
                sum1 += a[j];
            }
            for (int j = i; j < a.length; j++){
                sum2 += a[j];
            }
            if (sum1 == sum2){

            }
        }
        return -1;
    }
}
