package OOP2023_2024.datastructure;

public class LinkedListMyList extends AbstractMyList {
    private Node start;
    private Node end;
    private int size;

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public LinkedListMyList() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        /* TODO */
        return getNodeByIndex(index).data;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        /* TODO */
        Node current = getNodeByIndex(index);
        current.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {
        /* TODO */
        Node newNode = new Node(value);
        newNode.next = start;
        start = newNode;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        /* TODO */
        if (size == 0){
            insertAtStart(value);
        }
        else {
            Node last = getNodeByIndex(size - 1);
            Node newLast = new Node(value);
            last.next = newLast;
            newLast.next = null;
            size++;
        }

    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
        /* TODO */
        if (index == 0){
            insertAtStart(value);
            size++;
        }
        else {
            Node temp = new Node(value);
            Node cur = getNodeByIndex(index - 1);
            cur.next = temp;
            temp.next = cur.next;
            size++;
        }


    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index == 0){
            start = start.next;
            size--;
        }
        else if (index == size - 1){
            Node cur = getNodeByIndex(size - 2);
            cur.next = null;
            size--;
        }
        else {
            Node cur = getNodeByIndex(index - 1);
            cur.next = cur.next.next;
            size--;
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        Node cur = start;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     * @return
     */
    @Override
    public int[] toArray() {
        /* TODO */
        int[] arr = new int[size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = get(i);
        }
        return arr;
    }
}
