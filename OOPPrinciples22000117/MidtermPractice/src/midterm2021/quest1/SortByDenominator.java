package midterm2021.quest1;

import java.util.Comparator;

public class SortByDenominator implements Comparator<Fraction> {
    public int compare(Fraction o1, Fraction o2){
        if (o1.getDenominator() > o2.getDenominator()){
            return 1;
        }
        else if (o1.getDenominator() < o2.getDenominator()){
            return -1;
        }
        return 0;
    }
}
