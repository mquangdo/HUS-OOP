package midterm.year2223.de3.books;

public class TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */
        System.out.println("TEST ARRAYLIST BOOK:");
        MyList list = new MyArrayList();
        for (int i = 0; i < 10; i++){
            String name = String.format("Book00%d", (int)(Math.random() * 20));
            int year = (int)(Math.random() * 1800) + 200;
            int page = (int)(Math.random() * 100) + 100;
            Book book = new Book(name, year, page);
            list.append(book);
        }

        BookManager manager = new BookManager(list);

        System.out.println("\nTest sort increasing by title:");
        testIterator(manager.sortByTitle(true));
        System.out.println("\nTest sort decreasing by title:\"");
        testIterator(manager.sortByTitle(false));
        System.out.println("\nTest sort increasing by page:");
        testIterator(manager.sortByPageNumber(true));
        System.out.println("\nTest sort decreasing by page:");
        testIterator(manager.sortByPageNumber(false));
        System.out.println();
    }

    public static void testMyLinkedList() {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */
        System.out.println("TEST LINKEDLIST BOOK:");
        MyList list = new MyLinkedList();
        for (int i = 0; i < 10; i++){
            String name = String.format("Book00%d", (int)(Math.random() * 20) + 10);
            int year = (int)(Math.random() * 1800) + 200;
            int page = (int)(Math.random() * 100) + 100;
            Book book = new Book(name, year, page);
            list.append(book);
        }
        BookManager manager = new BookManager(list);

        System.out.println("\nTest sort increasing by title:");
        testIterator(manager.sortByTitle(true));
        System.out.println("\nTest sort decreasing by title:\"");
        testIterator(manager.sortByTitle(false));
        System.out.println("\nTest sort increasing by page:");
        testIterator(manager.sortByPageNumber(true));
        System.out.println("\nTest sort decreasing by page:");
        testIterator(manager.sortByPageNumber(false));
        System.out.println();
    }

    public static void testIterator(MyList myList) {
        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
        MyIterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
