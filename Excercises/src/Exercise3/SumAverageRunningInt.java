package Exercise3;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        findSumAverageRunningInt_0();
        findSumAverageRunningInt_1();
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
}
