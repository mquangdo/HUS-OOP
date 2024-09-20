package Exercise4;
import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array;
        array = inputMark3(in);
        averageMark(array);
    }

    public static int[] inputMark3(Scanner in) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            boolean check = false;
            do {
                System.out.print("Enter the mark (0 - 100) for student" + (i + 1) + ": ");
                int mark = in.nextInt();
                if (mark >= 0 && mark <= 100) {
                    check = true;
                    array[i] = mark;
                }
                if (!check) {
                    System.out.println("Invalid input, try again !");
                }

            } while (!check);
        }
        return array;
    }
    public static void averageMark(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / 3;
        System.out.printf("The average is: %.2f", average);
    }
}
