package Exercise3;

public class ComputePI {
    public static void main(String[] args) {
        System.out.println(computePI_0(10000));
        System.out.println(computePI_1(10000));
        comparePI();
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
}
