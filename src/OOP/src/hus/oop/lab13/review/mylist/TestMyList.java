package hus.oop.lab13.review.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        System.out.println();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList arrayList = new MyArrayList();
        arrayList.append(1);
        arrayList.append(2);
        arrayList.append(3);
        arrayList.insert(4,3);
        arrayList.remove(2);
        arrayList.insert(0,0);
        arrayList.remove(1);
        arrayList.remove(0);
        System.out.println(arrayList.toString());
        BasicStatistic basicStatistic = new BasicStatistic(arrayList);
        System.out.println("Max value: " + basicStatistic.max());
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        MyList myLinkedList = new MyLinkedList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.insert(4,3);
        System.out.println(myLinkedList.toString());
    }
}
