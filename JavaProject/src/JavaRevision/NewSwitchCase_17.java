package JavaRevision;



class Test{
    public static void main(String[] args) {
        System.out.println("test");
        Demo demo = new Demo(3,4);
        System.out.println(demo.add());
    }
}

class NewSwitchCase_17 {
    public static void main(String[] args) {
        testSwitchCase(2);
        testSwitchCase2(6);
        testSwitchCase3(5);
    }

    public static void testSwitchCase(int n){
        switch (n){
            case 2:
                System.out.println("Go to school");
                break;
            case 3:
                System.out.println("Sleep");
                break;
            default:
                System.out.println("Default");
        }
    }

    public static void testSwitchCase2(int n){
        switch (n){
            case 7, 8:
                System.out.println("At home");
                break;
            case 6:
                System.out.println("Happy");
                break;
            default:
                System.out.println("Not happy");
                break;
        }
    }

    public static void testSwitchCase3(int n){
        switch (n){
            case 5,6 -> System.out.println("Go to school");
            case 2,3 -> System.out.println("So sad");
            default -> System.out.println("Hehehe");
        }
    }
}


// A small test in class and object
class Demo{
    int firstAttri = 1;
    int secAttri = 2;
    public Demo(){

    }

    public Demo(int num1, int num2){
        firstAttri = num1;
        secAttri = num1;
    }

    public int add(){
        return firstAttri + secAttri;
    }
}


