package JavaRevision;

public class TypeConversion_8 {
    public static void main(String[] args) {
        byte b = 125;
        int a = 300;
        byte k = (byte)a; // k = a % 256
        int c = (int)k;
        float d = 5.1f;
        long e = 2L;
        System.out.println(b);
        System.out.println(k); //44
        System.out.println(c); //44
        System.out.println(e); //2
        System.out.println(d); // 5.1
    }
}
