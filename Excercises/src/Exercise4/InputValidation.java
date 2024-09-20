package Exercise4;
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        inputValidationUsingDoWhile(in);
        in.close();
    }

    public static void inputValidationUsingDoWhile(Scanner in) {
        boolean check = false;
        do {
            System.out.println("Enter a number between 0-10 or 90-100: ");
            int numberIn = in.nextInt();
            if ((numberIn > 0 && numberIn < 10) || (numberIn > 90 && numberIn < 100)) {
                check = true;
            }
            if (!check) {
                System.out.println("Invalid input, try again !");
            } else {
                System.out.println("You have entered: " + numberIn);
            }
        } while (!check);
        in.close();
    }

}
