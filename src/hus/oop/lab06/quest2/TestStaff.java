package hus.oop.lab06.quest2;

public class TestStaff {
    public static void main(String[] args) {
        Staff staff = new Staff("Quan","HP","HUS",1);
        System.out.println("Staff's name is: " + staff.getName());
        System.out.println("Staff's school is: " + staff.getSchool());
        staff.setSchool("HUST");
        System.out.println("Staff's new school is: " + staff.getSchool());
        System.out.println(staff);
    }
}
