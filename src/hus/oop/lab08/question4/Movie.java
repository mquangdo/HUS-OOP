package hus.oop.lab08.question4;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private double rating;
    public int compareTo(Movie movie){
        return this.year - movie.getYear();
    }
    public Movie(String name, double rating, int year){
        this.name = name;
        this.year = year;
        this.rating = rating;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public double getRating(){
        return rating;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setRating(double rating){
        this.rating = rating;
    }
}

