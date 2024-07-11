package oopexample;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class InnerClassExample {

    public InnerClassExample(){
    }

    public void print(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
        InnerClassExample main = new InnerClassExample();
        main.print();
    }
}

// Outputs 15 (5 + 10)
