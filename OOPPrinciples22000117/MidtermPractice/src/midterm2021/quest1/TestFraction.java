package midterm2021.quest1;
import java.util.*;
import java.util.Random;

public class TestFraction {
    public static void main(String[] args) {
        SortByDenominator sortByDenominator = new SortByDenominator();
        TestFraction testFraction = new TestFraction();
        List<Fraction> fractionsList = testFraction.fractions;
        testFraction.print(fractionsList);
        testFraction.sortByValue(fractionsList);
        testFraction.print(fractionsList);
        testFraction.sortByDenominator(fractionsList);
        testFraction.print(fractionsList);
    }
    private List<Fraction> fractions;

    public TestFraction(){
        fractions = new ArrayList<Fraction>();
        Random random = new Random();
        for (int i = 0; i < 30; i++){
            int numerator = random.nextInt(1,1001);
            int denominator = random.nextInt(1, 1001);
            Fraction fraction = new Fraction(numerator, denominator);
            fractions.add(fraction);
        }
    }
    public List<Fraction> sortByDenominator(List<Fraction> list){
        SortByDenominator sortByDenominator = new SortByDenominator();
        Collections.sort(list, sortByDenominator);
        return list;
    }

    public List<Fraction> sortByValue(List<Fraction> list){
        Collections.sort(list);
        return list;
    }

    public void print(List<Fraction> list){
        for (Fraction fraction: list){
            System.out.print(fraction + " ");
        }
        System.out.println();
    }

    public Fraction getSecondLargestValue(List<Fraction> list){
        Collections.sort(list);
        return list.get(list.size() - 2);
    }
}
