package hus.oop.vector;

import java.util.Arrays;

public class TestVector {
    public static void main(String[] args) {
        /*
         TODO

         Thực hiện các yêu cầu sau.

         I. Test chức năng vector
           - Sinh ngẫu nhiên một số tự nhiên, lưu giá trị sinh ra vào biến n.
           - Tạo ra các vector có kích thước n, với các phần tử được sinh ngẫu nhiên. Trong đó có 2 vector kiểu MyArrayList
             và 2 vector có kiểu MyListVector.
           - Viết các hàm để test các chứ năng của các vector, như thêm vào phần tử, xóa bớt phần tử, sửa giá trị các
             phần tử, cộng các vector, nhân vector với vô hướng, tích vô hướng 2 vector, chuẩn vector, ... Mỗi lần thay
             đổi vector hoặc tính toán, in kết quả ra terminal.

         II. Lưu các kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_Vector>.txt
              (ví dụ NguyenVanA_123456_Vector.txt). Nén các file source code và file kết quả vào file zip có tên
              <Ten_MaSinhVien_Vector>.zip (ví dụ NguyenVanA_123456_Vector.zip), nộp lên classroom.
         */
        testArrayVector();
        testListVector();
    }

    public static void testArrayVector(){

        System.out.println("\nTEST ARRAY VECTOR:");
        int num = (int)(Math.random() * (10 - 5)) + 5;
        MyArrayVector arrayVector1 = new MyArrayVector();
        MyArrayVector arrayVector2 = new MyArrayVector();


        for (int i = 0; i < num; i++){
            arrayVector1.insert((Math.random() * ( 5 - 1)) + 1);
        }
        for (int i = 0; i < num; i++){
            arrayVector2.insert((Math.random() * ( 5 - 1)) + 1);
        }
        System.out.println("Vector1:");
        System.out.println(arrayVector1);
        System.out.println("Vector2:");
        System.out.println(arrayVector2);
        System.out.println("Test add vector with value:");
        System.out.println(arrayVector1.add(5.0));
        System.out.println("Test vector1 addTo value:");
        System.out.println((arrayVector1.addTo(5.0)));
        System.out.println("Test minus vector with value:");
        System.out.println(arrayVector1.minus(5.0));
        System.out.println("Test vector1 minusFrom value:");
        System.out.println(arrayVector1.minusFrom(arrayVector2));
        System.out.println("Test vector1 add vector2:");
        System.out.println(arrayVector1.add(arrayVector2));
        System.out.println("Test vector1 addTo vector2:");
        System.out.println(arrayVector1.addTo(arrayVector2));
        System.out.println("Test remove:");
        System.out.println(arrayVector1.remove(0));
        System.out.println("Test append");
        System.out.println(arrayVector1.insert(2.9));
        System.out.println("Test scale vector1:");
        System.out.println(arrayVector1.scale(2));
        System.out.println("Test norm vector1:");
        System.out.println(arrayVector1.norm());
        System.out.println("Test dot vector1 with vector2:");
        System.out.println(arrayVector1.dot(arrayVector2));
        System.out.println("Test extract:");
        int[] id = {1,2};
        System.out.println(arrayVector1.extract(id));
        System.out.println();
    }

    public static void testListVector(){
        System.out.println("\nTEST LIST VECTOR:");
        int num = (int)(Math.random() * (10 - 5)) + 5;

        MyListVector listVector1 = new MyListVector();
        MyListVector listVector2 = new MyListVector();

        for (int i = 0; i < num; i++){
            listVector1.insert((Math.random() * ( 5 - 1)) + 1);
        }
        for (int i = 0; i < num; i++){
            listVector2.insert((Math.random() * ( 5 - 1)) + 1);
        }

        System.out.println("Vector1:");
        System.out.println(listVector1);
        System.out.println("Vector2:");
        System.out.println(listVector2);
        System.out.println("Test add vector with value:");
        System.out.println(listVector1.add(5.0));
        System.out.println("Test vector1 addTo value:");
        System.out.println(listVector1.addTo(5.0));
        System.out.println("Test minus vector with value:");
        System.out.println(listVector1.minus(5.0));
        System.out.println("Test vector1 minusFrom value:");
        System.out.println(listVector1.minusFrom(listVector2));
        System.out.println("Test vector1 add vector2:");
        System.out.println(listVector1.add(listVector2));
        System.out.println("Test vector1 addTo vector2:");
        System.out.println(listVector1.addTo(listVector2));
        System.out.println("Test remove:");
        System.out.println(listVector1.remove(0));
        System.out.println("Test append");
        System.out.println(listVector1.insert(2.9));
        System.out.println("Test scale vector1:");
        System.out.println(listVector1.scale(2));
        System.out.println("Test norm vector1:");
        System.out.println(listVector1.norm());
        System.out.println("Test dot vector1 with vector2:");
        System.out.println(listVector1.dot(listVector2));
        System.out.println();
    }

    public static String printVector(MyVector vector){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < vector.size(); i++){
            stringBuilder.append(String.format("%.2f",vector.coordinates()[i])).append(" ");
            if (i == vector.size() - 1){
                stringBuilder.append(vector.coordinates()[i]).append("]");
            }
        }
        return stringBuilder.toString();
    }
}
