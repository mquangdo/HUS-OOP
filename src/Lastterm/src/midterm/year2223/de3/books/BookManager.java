package midterm.year2223.de3.books;

public class BookManager {
    private MyList books;

    /**
     * Khởi tạo dữ liệu cho BookManager.
     */
    public BookManager(MyList data) {
        /* TODO */
        this.books = data;
    }

    /**
     * Lấy ra danh sách các sách được sắp xếp theo thứ tự title.
     * Chú ý, không thay đổi thứ tự sách trong danh sách gốc.
     * @param order
     * @return danh sách các sách đã được sắp xếp.
     */
    public MyList sortByTitle(boolean order) {
        /*
         TODO

         - Sửa lại lớp Book để sử dụng BookComparable để thực hiện việc so sánh các Book theo title.

         - Sử dụng tiêu chí so sánh trong BookComparable, viết code để sắp xếp danh sách các sách theo thứ tự
           phụ thuộc tham số order. Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì
           sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách mới các sách đã được sắp thứ tự.
         */
        MyList res = new MyLinkedList();
        for (int i = 0; i < books.size(); i++) {
            res.append(books.get(i));
        }

        for (int i = 0; i < res.size() - 1; i++){
            for (int j = i + 1; j < res.size(); j++){
                Book book1 = (Book) res.get(i);
                Book book2 = (Book) res.get(j);
                if (order? book1.compareTo(book2) > 0 : book1.compareTo(book2) < 0){
                    Book temp = book1;
                    res.set(book2, i);
                    res.set(temp, j);
                }
            }
        }
        return res;
    }

    /**
     * Lấy ra danh sách các sách được sắp xếp theo pages.
     * Chú ý, không thay đổi thứ tự sách trong danh sách gốc.
     * @param order
     * @return danh sách các sách đã được sắp xếp.
     */
    public MyList sortByPageNumber(boolean order) {
        /*
         TODO

         - Thêm lớp PageComparison sử dụng BookComparator để có thể so sánh các sách theo pages.

         - Viết code sử dụng PageComparison để sắp xếp sách theo thứ tự phụ thuộc tham số order.
           Nếu order là true thì sắp xệp theo thứ tự tăng dần. Nếu order là false thì sắp xếp theo thứ tự giảm dần.

         - Trả ra danh sách mới các sách đã được sắp xếp.
         */
        PageComparison pageComparison = new PageComparison();

        MyList res = new MyLinkedList();
        for (int i = 0; i < books.size(); i++) {
            res.append(books.get(i));
        }

        for (int i = 0; i < res.size() - 1; i++){
            for (int j = i + 1; j < res.size(); j++){
                Book book1 = (Book) res.get(i);
                Book book2 = (Book) res.get(j);
                if (order? pageComparison.compare(book1, book2) > 0 : pageComparison.compare(book1, book2) < 0){
                    Book temp = book1;
                    res.set(book2, i);
                    res.set(temp, j);
                }
            }
        }
        return res;

    }
}
