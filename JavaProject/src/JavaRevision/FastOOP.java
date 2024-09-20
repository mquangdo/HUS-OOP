package JavaRevision;

public class FastOOP {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.b);
        b.testModify(b);
        System.out.println(b.b);
    }
}

class A{
    public int e;
    public int d;
    public A(){

    }
    public void show(){
        System.out.println("in A");
    }
}

class B extends A{
    int b = 0;
    public void test(){
        System.out.println("Test");
    }
    public void show(){
        super.show();
        System.out.println("in B");
    }
    public void setB(int b){
        this.b = b;
    }
    public void testModify(B b){
        b.setB(1);
    }
}


