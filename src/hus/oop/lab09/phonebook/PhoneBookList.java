package hus.oop.lab09.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook{
    ArrayList<Student> phoneBook;
    public PhoneBookList(){
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p){
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student: phoneBook){
            if (student.name.equals(name)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (Student student: phoneBook){
            if (student.name.equals(lastname)){
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student: phoneBook){
            if (student.phone.equals(phone)){
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (Student student: phoneBook){
            if (student.phone.equals(phone)){
                phoneBook.remove(student);
            }
        }
    }
}
