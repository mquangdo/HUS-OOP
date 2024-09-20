package week5;
import java.util.Scanner;

public class SuperPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isSuperPrime(n));

    }

    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        else{
            for (int i = 2; i < Math.sqrt(n); i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;

        }

    }

    public static boolean isSuperPrime(int n){
        if (n < 2){
            return false;
        }
        else {
            while (n > 0){
                if (!isPrime(n)){
                    return false;
                }
                n = n / 10;
            }
            return true;
        }
    }
}
