package hus.oop.lab09.library;

abstract class Item {
    protected String title;
    protected int year;

    public Item(String title, int year){
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
