package Exercise2;

public class PrintDayInWord {
    public static void main(String[] args) {

    }

    public static void printDayInWord_0(int day) { // use if else statements
        if (day == 0){
            System.out.println("SUNDAY");
        } else if (day == 1) {
            System.out.println("MONDAY");
        } else if (day == 2) {
            System.out.println("TUESDAY");
        } else if (day == 3) {
            System.out.println("WEDNESDAY");
        } else if (day == 4) {
            System.out.println("THURSDAY");
        } else if (day == 5) {
            System.out.println("FRIDAY");
        } else if (day == 6) {
            System.out.println("SATURDAY");
        }else {
            System.out.println("Not a valid day!");
        }
    }

    public static void printDayInWord_1(int day){ //use switch case statements
        switch (day){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("Not a valid day!");
        }
    }
}
