package midterm2022.quest1;

public class MyMath {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.cos(60));
        System.out.println(myMath.exp(1));
    }
    public MyMath(){

    }
    public double cos(double val){
        double epsilon = 0.000000000000000000001;
        double x = Math.toRadians(val);
        double numerator = 1;
        double denominator = 1;
        double res = 0;
        int i = 1;
        while (Math.abs(numerator / denominator) >= epsilon){
            res = res + numerator / denominator;
            numerator *= - x * x;
            denominator *= (2 * i - 1) * (2 * i);
            i++;
        }
        return res;
    }

    public double exp(double val){
        double epsilon = 0.000000000000000000001;
        double numerator = 1;
        double denominator = 1;
        int i = 1;
        double res = 0;
        while (numerator / denominator >= epsilon){
            res = res + numerator / denominator;
            numerator *= val;
            denominator *= i;
            i++;
        }
        return res;
    }
}
