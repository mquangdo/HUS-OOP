import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
//        System.out.println(findFactorial(5));

        //Prob 2.1 CheckPassFail
        checkPassFail(49);

        //Prob 2.2 CheckOddEven
        checkOddEven(-1);

        //Prob 2.3 PrintNumberInWord
        printNumberInWord_0(9); //a) use if else statements
        printNumberInWord_1(9); //b) use switch case default statements

        //Prob 2.4 PrintDayInWord
        printDayInWord_0(5); //a) use if else statements
        printDayInWord_1(6); //b) use switch case statements

        //Prob 3.1 SumAverageRunningInt
        findSumAverageRunningInt_0(); //use for loop
        findSumAverageRunningInt_1(); //use while loop

        //Prob 3.2 HamornicSum
        findHarmonicSum();

        //Prob 3.3 ComputePI
        System.out.println(computePI_0(10000));
        System.out.println(computePI_1(10000));
        comparePI();

        //Prob 3.4 Fibonacci

        //Prob 3.5 ExtractDigits
        extractDigits(292004);

        //Prob 4.1 SumProductMinMax3
        findSumProductMinMax3();
        findSumProductMinMax5();

//        printNumberInWord_0(10);
//
//        findSumAverageRunningInt();
//        System.out.println(findSumOfTheSquares(100));
//        System.out.println(findSumOfOddOrEven());
//        System.out.println(findHarmonicSum());
//        System.out.println(coumputePI(100000));
    }

    public static int findFactorial(int n) {
        float factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return (int) factorial;
    }

    public static void checkPassFail(int mark) {
        System.out.println("The mark is " + mark);
        if (mark >= 50) {
            System.out.println("PASS");

        } else {
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }

    public static void checkOddEven(int n) {
        System.out.println("The number is " + n);
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }

    public static void printNumberInWord_0(int number) {  //This method uses if else statements
        if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }

    public static void printNumberInWord_1(int number){ // This method uses switch case default statements
        switch (number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static void printDayInWord_0(int day) { // use if else statements
       if (day == 0){
           System.out.println("SUNDAY");
       } else if (day == 1) {
           System.out.println("MONDAY");
       } else if (day == 2) {
           System.out.println("TUESDAY");
       } else if (day == 3) {
           System.out.println("WEDNESDAY");
       } else if (day == 4) {
           System.out.println("THURSDAY");
       } else if (day == 5) {
           System.out.println("FRIDAY");
       } else if (day == 6) {
           System.out.println("SATURDAY");
       }else {
           System.out.println("OTHER");
       }
    }

    public static void printDayInWord_1(int day){ //use switch case statements
        switch (day){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    //Prob 3.1
    public static void findSumAverageRunningInt_0() {
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += number;
        }
        double average = (double) sum / 100;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average " + average);
    }

    //Try

    //1
    public static void findSumAverageRunningInt_1(){
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int sum = 0;
        int number = LOWERBOUND;
        while (number <= UPPERBOUND){
            sum += number;
            number++;
        }
        double average = (double) sum / 100;
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The average " + average);
    }

    //3
    /* Vòng lặp for cần biết trước số lượng vòng lặp, trong khi vòng lặp while thì không
    * Vòng lặp while sẽ kiểm tra điều kiện trước rồi mới thực hiện khối lệnh còn do - while thì
    * thực hiện luôn xong mới kiểm tra điều kiện  */



    public static int findSumOfTheSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static int findSumOfOddOrEven() {
        int UPPER = 100;
        int sumOdd = 0;
        int sumEven = 0;
        for (int number = 1; number <= UPPER; number++) {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }
        return Math.abs(sumEven - sumOdd);
    }


    //Prob 3.2
    public static void findHarmonicSum(){
        double sumL2R = 0;
        double sumR2L = 0;
        int n = 5000;
        for (double i = 1; i <= n; i++){
            sumL2R += 1 / i;
        }

        for (double i = n; i >= 1; i--){
            sumR2L += 1 / i;
        }
        System.out.println("The sum from left to right is " + sumL2R);
        System.out.println("The sum from right to left is " + sumR2L);
        System.out.println("The difference between these 2 sums is " + Math.abs(sumL2R - sumR2L));
    }


    //Prob 3.3
    public static double computePI_0(int upper){
        final int MAX_DENOMINATOR = upper;
        double quarterPI = 0.0;
        for (double number = 1; number <= MAX_DENOMINATOR; number++){
            if (number % 4 == 1){
                quarterPI += 1 / number;
            } else if (number % 4 == 3) {
                quarterPI -= 1 / number;
            }else {
                continue;
            }
        }
        double PI = 4 * quarterPI;
        return PI;
    }

    //Try

    //1
    public static double computePI_1(int upper){
        double quarterPI = 0.0;
        int MAX_TERM = upper;
        for (int term = 1; term <= MAX_TERM; term++){
            if (term % 2 == 1){
                quarterPI += 1.0 / (term * 2 - 1);
            }
            else {
                quarterPI -= 1.0 / (term * 2 - 1);
            }
        }
        double PI = 4 * quarterPI;
        return PI;
    }

    //2
    public static void comparePI(){
        final double PI = Math.PI;
        double piComputed = computePI_0(10000);
        double value = (piComputed / PI) * 100;
        System.out.println("The value is " + value);
    }

    // Prob 3.4
//    public static boolean findNthFibonacci(int n){
//
//    }

    //Prob 3.5
    public static void extractDigits(int number){
        while (number > 0){
            int digit = number % 10;
            number /= 10;
            System.out.print(digit + " ");
        }
        System.out.println();
    }

    //Prob 4.1
    public static void findSumProductMinMax3(){
        int number1;
        int number2;
        int number3;
        int sum;
        int product;
        int min;
        int max;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st integer: ");
        number1 = sc.nextInt();

        System.out.println("Enter the 2nd integer: ");
        number2 = sc.nextInt();

        System.out.println("Enter the 3rd integer: ");
        number3 = sc.nextInt();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;

        min = number1;
        if (number3 < min){
            min = number3;
        }
        if (number2 < min){
            min = number2;
        }


        max = number1;
        if (number3 > max){
            max = number3;
        }
        if (number2 > max){
            max = number2;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }

    //Try
    public static void findSumProductMinMax5(){
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;
        int sum;
        int product;
        int min;
        int max;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st integer: ");
        number1 = sc.nextInt();

        System.out.println("Enter the 2nd integer: ");
        number2 = sc.nextInt();

        System.out.println("Enter the 3rd integer: ");
        number3 = sc.nextInt();

        System.out.println("Enter the 4th integer: ");
        number4 = sc.nextInt();

        System.out.println("Enter the 5th integer: ");
        number5 = sc.nextInt();

        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;

        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
    }

    //Prob 4.2
    public static void findCircleComputation(){
        Scanner sc = new Scanner(System.in);
        double radius;
        double diameter;
        double perimeter;
        double circumference;
        double area;

        System.out.println("Enter the radius: ");
        radius = sc.nextDouble();



    }



}
