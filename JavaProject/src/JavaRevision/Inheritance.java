package JavaRevision;

public class Inheritance {
    public static void main(String[] args)
    {

//        MountainBike mb = new MountainBike(3, 100, 25);
//        System.out.println(mb.toString());

    }
}

class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }

    public Bicycle(){

    }
}


// derived class
class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override
    public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

//Multilevel Inheritance
class One {

    public void print_geek()
    {
        System.out.println("Geeks");
    }


}

class Two extends One {

    public void print_for() { System.out.println("for"); }
}

class Three extends Two {

    public void print_geek()
    {
        System.out.println("Geeks");
    }
}
//interface One {
//    public void print_geek();

//
//interface Two {
//    public void print_for();
//}
//
//interface Three extends One, Two {
//    public void print_geek();
//}
//class Child implements Three {
//    @Override
//    public void print_geek() {
//        System.out.println("Geeks");
//    }
//    @Override
//    public void print_for() {
//        System.out.println("for");
//    }
//
//}



