package theory.collectionframework;

import java.util.*;
import java.util.function.Predicate;

public class section1_2 {
    public static void main(String[] args) {
        //List
        List<String> coffee = new ArrayList<>();
        coffee.add("espresso");
        coffee.add("latte");
        coffee.add("cappuccino");
        System.out.println(coffee);

        Iterator<String> iter = coffee.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }

        for (String str : coffee) {
            System.out.println(str.toUpperCase());
        }

        //Set
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Kumden", 18));
        personSet.add(new Person("Kumden",18));
        personSet.add(new Person("Kumden",18));
        System.out.println(personSet);

        //Stream
        List<Person> personList = List.of(new Person("Kumden", 18),new Person("Kumden",18),new Person("Kumden",18));
        System.out.println(personList);
        Predicate<Person> adult = p -> p.getAge() >= 18;
       personList.stream().filter(adult).forEach(Person::sayHello);



    }
}

class Person {
    private final String name; // private instance variables
    private final int age;

    public Person(String name, int age) { // constructor
        this.name = name;
        this.age = age;
    }

    public String getName() { // getter for name
        return name;
    }

    public int getAge() { // getter for age
        return age;
    }

    public String toString() { // describe itself
        return name + "(" + age + ")";
    }

    public void sayHello() { // for testing
        System.out.println(name + " says hello ");
    }

    // Compare two Person objects by name strings
    @Override
    public boolean equals(Object o) {
        return (o != null)
                && (o instanceof Person)
                && this.name.equalsIgnoreCase(((Person) o).name);
    }

    // To be consistent with equals ()
// Two objects which are equal shall have the same hashcode.
    @Override
    public int hashCode() {
        return this.name.toLowerCase().hashCode();
    }
}