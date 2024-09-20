package midterm2021.quest1;

public class Fraction extends Number implements Comparable<Fraction>{
    private int numerator;
    private int denominator;

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(1,2);
        Fraction f3 = new Fraction(1);
        f1.add(f2);
        f1.add(f3);
        System.out.println(f1);
        System.out.println(f1.doubleValue());

    }
    public Fraction(Fraction fraction){

    }

    public Fraction(int value){
        this.numerator = value;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction){
        this.numerator *= fraction.getDenominator();
        this.denominator *= fraction.getDenominator();
        fraction.setNumerator(fraction.getNumerator() * this.numerator);
        fraction.setDenominator(fraction.getDenominator() * this.denominator);
        this.numerator += fraction.getNumerator();
        this.simplify(this);
        return this;
    }

    public Fraction add(int value){
        Fraction fraction = new Fraction(value);
        this.add(fraction);
        return this;
    }

    public int compareTo(Fraction fraction) {
        double doubleValue1 = this.doubleValue();
        double doubleValue2 = fraction.doubleValue();
        if (doubleValue1 > doubleValue2) {
            return 1;
        } else if (doubleValue1 < doubleValue2) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Fraction fraction){
        if (this.compareTo(fraction) == 0){
            return true;
        }
        return false;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    double doubleValue() {
        return (double) this.numerator / this.denominator;
    }

    @Override
    float floatValue() {
        return (float) this.numerator / this.denominator;
    }

    @Override
    int intValue() {
        return this.numerator / this.denominator;
    }

    @Override
    long longValue() {
        return (long) this.numerator / this.denominator;
    }

    @Override
    short shortValue() {
        return (short) ((short) this.numerator / this.denominator);
    }

    private int gcd(int num1, int num2){
        while (num1 != num2){
            if (num1 > num2){
                num1 = num1 - num2;
            }
            else {
                num2 = num2 - num1;
            }
        }
        return num1;
    }

    private void simplify(Fraction fraction){
        int gcd = gcd(fraction.numerator, fraction.denominator);
        fraction.setNumerator(fraction.numerator / gcd);
        fraction.setDenominator(fraction.denominator / gcd);
    }

    @Override
    public String toString() {
        return String.format("Fraction[%d, %d]",this.numerator, this.denominator);
    }
}
