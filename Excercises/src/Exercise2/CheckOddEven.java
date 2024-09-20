package Exercise2;
import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        checkOddOrEven(number);

    }
    public static void checkOddOrEven(int number) {
        System.out.println("This is number " + number);
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("Bye!");
    }
}
