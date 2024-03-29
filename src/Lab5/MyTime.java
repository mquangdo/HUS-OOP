package Lab5;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){

    }
    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }

    @Override
    public String toString() {
        String hour;
        String minute;
        String second;
        if (this.hour < 10){
            hour = "0" + this.hour;
        }
        else {
            hour = "" + this.hour;
        }
        if(this.minute < 10){
            minute = "0" + this.minute;
        }
        else {
            minute = "" + this.minute;
        }
        if (this.second < 10){
            second = "0" + this.second;
        }
        else {
            second = "" + this.second;
        }
        return hour + ':' + minute + ':' + second;
    }
    public MyTime nextSecond(){
        this.second += 1;
        if (this.second == 60){
            this.second = 0;
            this.minute += 1;
            if(this.minute == 60){
                this.minute = 0;
                this.hour += 1;
                if (this.hour == 24){
                    this.hour = 0;
                }
            }
        }
        return this;
    }
    public MyTime nextMinute(){
        this.minute += 1;
        if(this.minute == 60){
            this.minute = 0;
            this.hour += 1;
            if (this.hour == 24){
                this.hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour(){
        this.hour += 1;
        if (this.hour == 24){
            this.hour = 0;
        }
        return this;
    }
    public MyTime previousSecond(){
        this.second -= 1;
        if (this.second == -1){
            this.second = 59;
            this.minute -= 1;
            if(this.minute == -1){
                this.minute = 59;
                this.hour -= 1;
                if (this.hour == -1){
                    this.hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute(){
        this.minute -= 1;
        if(this.minute == -1){
            this.minute = 59;
            this.hour -= 1;
            if (this.hour == -1){
                this.hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour(){
        this.hour -= 1;
        if (this.hour == -1){
            this.hour = 23;
        }
        return this;
    }

    public static void testMyTime(){
        MyTime myTime = new MyTime(17,58,0);
        System.out.println(myTime.nextHour());
        System.out.println(myTime.previousSecond());
    }
}
