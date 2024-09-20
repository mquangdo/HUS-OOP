package week7;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = {1,2,3,4,5};
        int[] b = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++){
            if (i < n) {
                b[i] = a[i];
            }
            else {
                b[i] = a[i + 1];
            }

        }
        for (int i = 0; i < b.length; i++){
            System.out.println(b[i] + " ");
        }
    }
}
