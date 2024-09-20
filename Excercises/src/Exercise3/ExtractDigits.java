package Exercise3;

public class ExtractDigits {
    public static void main(String[] args) {
        extractDigits(292004);
    }
    public static void extractDigits(int number){
        while (number > 0){
            int digit = number % 10;
            number /= 10;
            System.out.print(digit + " ");
        }
        System.out.println();
    }
}
