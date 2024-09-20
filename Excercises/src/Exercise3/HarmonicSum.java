package Exercise3;

public class HarmonicSum {
    public static void main(String[] args) {
        findHarmonicSum();
    }
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
}
