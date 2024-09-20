package JavaRevision;

public class Interface {
    public static void main(String[] args) {
        TestInterface.show();
        Imple imple = new Imple();
        imple.square(2);
        imple.print();
    }
}
interface TestInterface
{
    // abstract method
    public void square (int a);

    // static method
    static void show()
    {
        System.out.println("Static Method Executed");
    }

    default void print(){
        System.out.println("Default Method Called");
    }
}
class Imple implements TestInterface{
    @Override
    public void square(int a) {
        System.out.println(4);
    }
}
interface TestInterface1
{
    // default method
    default void show()
    {
        System.out.println("Default TestInterface1");
    }
}

interface TestInterface2
{
    // Default method
    default void show()
    {
        System.out.println("Default TestInterface2");
    }
}

// Implementation class code
class TestClass implements TestInterface1, TestInterface2
{
    // Overriding default show method
    public void show()
    {
        // use super keyword to call the show
        // method of TestInterface1 interface
        TestInterface1.super.show();

        // use super keyword to call the show
        // method of TestInterface2 interface
        TestInterface2.super.show();
    }

    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.show();
    }
}

class Try{

}
