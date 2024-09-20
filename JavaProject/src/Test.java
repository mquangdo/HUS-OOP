import java.util.Scanner;
import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        System.out.println("Quang ngu hoc");
        System.out.println("Quang hoc gioi code");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1){
            System.out.println('1');

        }
        else if(n == 2){
            System.out.println('2');

        }
        else{
            System.out.println("M ngu a");
        }

    }
}
