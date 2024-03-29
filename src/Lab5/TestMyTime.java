package Lab5;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 23, 59);
        System.out.println(time);

        time.setTime(23, 59, 58);
        time.setHour(14);
        time.setMinute(11);
        time.setSecond(59);

        int hour = time.getHour();
        System.out.println("The current hour is: " + hour);
        int minute = time.getMinute();
        System.out.println("The current minute is: " + minute);
        int second = time.getSecond();
        System.out.println("The current second is: " + second);

        System.out.println("The time is: " + time.nextSecond());
        System.out.println("The time is: " + time.nextMinute());
        System.out.println("The time is: " + time.nextHour());

        System.out.println("The time is: " + time.previousSecond());
        System.out.println("The time is: " + time.previousMinute());
        System.out.println("The time is: " + time.previousHour());
    }
}
