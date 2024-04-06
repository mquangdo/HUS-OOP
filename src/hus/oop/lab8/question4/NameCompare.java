package hus.oop.lab8.question4;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right){
        return left.getName().compareTo(right.getName());
    }
}
