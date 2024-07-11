package hus.oop.lab09.phonebook;

interface PhoneBook {
    void addPerson(Student p);
    Student searchByName(String name);
    Student searchByLastName(String lastname);
    Student searchByNumber(String phone);
    void deleteByNumber(String phone);
}
