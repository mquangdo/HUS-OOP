package JavaRevision;
interface testNestedInterface {
    public void nestedMethod();
}

public class NestedInterface{

    // Nested interface


    public static void main(String[] args)
    {
        // Implement nested interface
        testNestedInterface nested = new testNestedInterface() {
            public void nestedMethod()
            {
                System.out.println(
                        "Hello from nested interface!");
            }
        };

        // Call nested interface method
        nested.nestedMethod();
    }
}


