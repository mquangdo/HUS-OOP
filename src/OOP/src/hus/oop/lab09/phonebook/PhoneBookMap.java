package hus.oop.lab09.phonebook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook{
    HashMap<String, Student> phoneBook;
    public PhoneBookMap(){
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.phone, p);
    }

    @Override
    public Student searchByName(String name) {
        for (String phone: phoneBook.keySet()){
            if (phoneBook.get(phone).name.equals(name)){
                return phoneBook.get(phone);
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (String phone: phoneBook.keySet()){
            if (phoneBook.get(phone).lastname.equals(lastname)){
                return phoneBook.get(phone);
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    @Override
    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
