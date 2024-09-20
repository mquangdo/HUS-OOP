package JavaRevision;

public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "Smartphone"; //Mobile.name
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "Smartphone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }


}

class Mobile{
    String brand;
    static String name; // static se thuoc ve class, nghia day la thuoc tinh cua class, chu kp cua doi tuong
    int price;          //luc nay cac doi tuong cua class se share chung 1 bien nay
                        //muốn gọi thuộc tính của class ta nên gọi qua tên class VD: Mobile.name
    public void show() {
        System.out.println(this.brand + " " + name + " " + price);
    }

    public static void show1(Mobile obj){ //static là thuộc về class
        System.out.println(obj.brand + " " + obj.brand + " " + obj.price);
    }

//    public static void show1(){
//        System.out.println(brand + " " + name + " " + price);//ko thể gọi thuộc tính non static vào static method
//    }                                                        //nếu muốn dùng thuộc tính non static vào static method
}                                                            //  thì ta cần gọi đối tượng vào, thì lúc này máy tính mới phân biệt được
                                                             //brand, name, price ở đây là của đối tượng vừa được gọi