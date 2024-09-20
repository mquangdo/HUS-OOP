package lab09.quest1;

import java.util.Date;

public class Rent {
    Item item;
    Student student;
    Date end;
    Date begin;

    public Rent(Item item, Student student, Date end, Date begin) {
        this.item = item;
        this.student = student;
        this.end = end;
        this.begin = begin;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "item=" + item +
                ", student=" + student +
                ", end=" + end +
                ", begin=" + begin +
                '}';
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }
}
