package hus.oop.lab07.quest6;

public class TestMain {
    public static void main(String[] args) {
        Animal kumden = new Dog("kumden");
        System.out.println(kumden);
        kumden.greets();
        Animal khangduong = new BigDog("khangduong");
        System.out.println(khangduong);
        khangduong.greets();
        Cat minhhoang = new Cat("anh Bo");
        System.out.println(minhhoang);
        minhhoang.greets();
    }

}
