package review.mylist;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("\nTEST MY ARRAY LIST:");
        MyArrayList arrayList = new MyArrayList();
        arrayList.append(9.5);
        arrayList.append(5.6);
        arrayList.append(3.3);
        arrayList.append(4.2);
        arrayList.append(5.6);
        System.out.println("\nOriginal list:");
        System.out.println(arrayList);
        arrayList.insert(6.4,0);
        arrayList.insert(6.9,3);
        arrayList.insert(7.8,6);
        System.out.println("\nInsert at index 0, 3, 6 with 6.4, 6.9, 7.8:");
        System.out.println(arrayList);
        arrayList.remove(0);
        arrayList.remove(1);
        arrayList.remove(2);
        arrayList.remove(4);
        System.out.println("\nRemove index 0, 1, 2, 4:");
        System.out.println(arrayList);
        System.out.println(arrayList.toString());
        BasicStatistic basicStatistic = new BasicStatistic(arrayList);
        System.out.println("\nMax value: " + basicStatistic.max());
        System.out.println("\nMin: " + basicStatistic.min());
        System.out.println("\nVariance: " + basicStatistic.variance());
        System.out.println("\nMean: " + basicStatistic.mean());
        System.out.println();

    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("\nTEST MY LINKED LIST:");
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(9.5);
        myLinkedList.append(5.6);
        myLinkedList.append(3.3);
        myLinkedList.append(4.2);
        myLinkedList.append(5.6);
        System.out.println("\nOriginal list:");
        System.out.println(myLinkedList);
        myLinkedList.insert(6.4,0);
        myLinkedList.insert(6.9,3);
        myLinkedList.insert(7.8,6);
        System.out.println("\nInsert at index 0, 3, 6 with 6.4, 6.9, 7.8:");
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        myLinkedList.remove(1);
        myLinkedList.remove(2);
        myLinkedList.remove(4);
        System.out.println("\nRemove index 0, 1, 2, 4:");
        System.out.println(myLinkedList);
        BasicStatistic basicStatistic = new BasicStatistic(myLinkedList);
        System.out.println("\nMax value: " + basicStatistic.max());
        System.out.println("\nMin: " + basicStatistic.min());
        System.out.println("\nVariance: " + basicStatistic.variance());
        System.out.println("\nMean: " + basicStatistic.mean());
        System.out.println();
    }
}
