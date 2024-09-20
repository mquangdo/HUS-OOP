public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static void twoPointer(int[] a, int[] b){
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        while (i < a.length || j < b.length){
            if (j == b.length + 1 || i < a.length && a[i] <= b[j]){

            }
        }
    }
}