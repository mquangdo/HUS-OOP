package hus.oop.mybookmanager;

public class MyLinkedList extends AbstractMyList {
    private Node head;

    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;

        public MyLinkedListIterator(int start) {
            /* TODO */
            this.currentPosition = start;
        }

        @Override
        public boolean hasNext() {
            /* TODO */
            return currentPosition < size();
        }

        @Override
        public Object next() {
            /* TODO */
            if (hasNext()){
                Object temp = getNodeByIndex(currentPosition).data;
                currentPosition++;
                return temp;
            }
            return null;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        /* TODO */
        this.head = null;
    }

    @Override
    public int size() {
        /* TODO */
        int count = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public Object get(int index){
        if (checkBoundaries(index, size() - 1)){
            return getNodeByIndex(index).data;
        }
        return null;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
        /* TODO */
        Node temp = getNodeByIndex(index);
        temp.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(Object value) {
        /* TODO */
        if(size() == 0){
            head.data = value;
        }
        else{
            Node newNode = new Node(head.data);
            newNode.next = head.next;
            head.data = value;
            head.next = newNode;
        }
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        /* TODO */
        Node newNode = new Node(value);
        Node lastNode = getNodeByIndex(size() - 1);
        lastNode.next = newNode;
        newNode.next = null;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        /* TODO */
        Node newNode = new Node(value);
        if (index == 0){
            insertAtStart(value);
        }
        else if (index == size()){
            insertAtEnd(value);
        }
        else {
            Node prev = getNodeByIndex(index - 1);
            Node cur = getNodeByIndex(index);
            prev.next = newNode;
            newNode.next = cur;
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
        if (checkBoundaries(index, size() - 1)){
            if(index == 0){
                Node nextNode = head.next;
                head.data = nextNode.data;
                head.next = nextNode.next;
            }
            else {
                Node prevNode = getNodeByIndex(index - 1);
                Node nextNode = getNodeByIndex(index + 1);
                if(index == size() - 1){
                    prevNode.next = null;
                }
                else
                    prevNode.next = nextNode;
            }
        }
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        /* TODO */
        if (checkBoundaries(index, size() - 1)){
            Node temp = head;
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
            return temp;
        }
        return null;
    }

    @Override
    public MyIterator iterator(int start) {
        /* TODO */
        return new MyLinkedListIterator(0);
    }

}
