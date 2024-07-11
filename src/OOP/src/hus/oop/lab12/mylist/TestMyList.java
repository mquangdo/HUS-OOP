package hus.oop.lab12.mylist;

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
        System.out.println("MyArrayList:");
        MyArrayList arrayList = new MyArrayList();
        arrayList.append(9.5);
        arrayList.append(5.6);
        arrayList.append(3.3);
        arrayList.append(4.2);
        arrayList.append(5.6);
        arrayList.insert(6.9,3);
        arrayList.remove(2);
        arrayList.insert(6.4,0);
        arrayList.remove(1);
        arrayList.remove(0);
        System.out.println(arrayList.toString());
        BasicStatistic basicStatistic = new BasicStatistic(arrayList);
        System.out.println("Max value: " + basicStatistic.max());
        System.out.println("Min: " + basicStatistic.min());
        System.out.println("Variance: " + basicStatistic.variance());
        System.out.println("Mean: " + basicStatistic.mean());

    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("MyLinkedList");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(9.7);
        myLinkedList.append(5.6);
        myLinkedList.append(3.7);
        myLinkedList.append(4.3);
        myLinkedList.append(5.7);
        myLinkedList.insert(6.3,3);
        myLinkedList.remove(2);
        myLinkedList.insert(8,0);
        myLinkedList.remove(1);
        myLinkedList.remove(0);
        System.out.println(myLinkedList.toString());
        BasicStatistic basicStatistic = new BasicStatistic(myLinkedList);
        System.out.println("Max value: " + basicStatistic.max());
        System.out.println("Min: " + basicStatistic.min());
        System.out.println("Variance: " + basicStatistic.variance());
        System.out.println("Mean: " + basicStatistic.mean());
    }
}
