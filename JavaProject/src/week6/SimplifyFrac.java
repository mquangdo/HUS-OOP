package week6;
import java.util.Scanner;

public class SimplifyFrac{

    // tử số là Nume, mẫu số là Denom, tính và in ra dạng tối giản của Nume/Denom
    public static void  printSimplest(int Nume, int Denom){
        //edit method here
        int gcd = GCD(Nume, Denom);
        Nume = Nume / gcd;
        Denom = Denom / gcd;
        System.out.println(Nume + " / " + Denom);

    }

    public static int GCD(int a, int b){
        if(a == 0 || b == 0){
            return a;
        }
        else{
            while (a != b){
                if(a > b){
                    a = a - b;
                }
                else {
                    b = b - a;
                }
            }
            return a;
        }
    }

    public static void main(String[] args){
        //edit method main here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a, b));
    }
}
