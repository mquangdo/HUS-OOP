package hus.oop.lab08.question4;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1.0;
        String s = "Q";
        System.out.println(s.compareTo("Q"));
    }
    public int compare(Movie left, Movie right) {
        if (Double.compare(left.getRating(), right.getRating()) == 0) {
            return 0;
        } else if (Double.compare(left.getRating(), right.getRating()) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
