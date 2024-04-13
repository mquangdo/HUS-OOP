package hus.oop.lab06.quest2;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Quang","HN","Comp Sci",2026,100);
        System.out.println(student);
        System.out.println("Student's name is: " + student.getName());
        System.out.println("Student's address is: " + student.getAddress());
        System.out.println("Student's program is: " + student.getProgram());
        student.setProgram("Data Sci");
        System.out.println("Student's new program is: " + student.getProgram());
    }
}
