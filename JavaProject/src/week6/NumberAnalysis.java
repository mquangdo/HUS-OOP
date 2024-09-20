package week6;
import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                System.out.println(i + " ");
                n = n / i;
            }
        }
    }
}

