package Exercise3;

public class Fibonacci {
    public static void main(String[] args) {
        printNthFibonacci();
    }
    public static int nthFibonacciNumber(int nMax) {
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int sum = 0;
        int n = 3;
        if (nMax < 3) {
            return fnMinus1;
        }
        else {
            while (n <= nMax) {
                sum = fnMinus2 + fnMinus1;
                fnMinus1 = fnMinus2;
                fnMinus2 = sum ;
                n++;
            }
        }
        return sum;
    }
    public static void printNthFibonacci() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(nthFibonacciNumber(i));
        }
    }
}

