package lastterm.year2324.mybookmanager;

import java.util.Objects;

public class MyLinkedList extends AbstractMyList {
    private Node head;
    private int size;
    private class MyLinkedListIterator implements MyIterator {
        private int currentPosition;
        private Node currentNode;
        public MyLinkedListIterator(int start, Node node) {
            this.currentPosition = start;
            this.currentNode = node;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < size;
        }

        @Override
        public Object next() {
            if(!hasNext())
                return null;
            currentPosition ++;
            currentNode = currentNode.next;
            return this.currentNode.data;
        }

        public Node getCurrentNode() {
            return currentNode;
        }
    }

    /**
     * Hàm dựng khởi tạo list để chứa dữ liệu.
     */
    public MyLinkedList() {
        head = new Node(-1);
    }

    @Override
    public int size() {
        return this.size;
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(Object data, int index) {
        Node current_node = getNodeByIndex(index);
        current_node.data = data;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(Object value) {
        if(size == 0){
            head.data = value;
        }
        else{
            Node newNode = new Node(head.data);
            newNode.next = head.next;
            head.data = value;
            head.next = newNode;
        }
        size ++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối tập dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(Object value) {
        Node newNode = new Node(value);
        Node lastNode = getNodeByIndex(size - 1);
        lastNode.next = newNode;
        size ++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của tập dữ liệu.
     * Chỉ thêm được nếu index nằm trong đoạn [0 - size()].
     * @param value
     * @param index
     */
    @Override
    public void insertAtPosition(Object value, int index) {
        if(!checkBoundaries(index, size + 1))
            throw new ArrayIndexOutOfBoundsException();
        Node newNode = new Node(value);
        Node currentNode = getNodeByIndex(index);
        currentNode.next = newNode;
        size ++;
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size() - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        if(index == 0){
            Node nextNode = head.next;
            head.data = nextNode.data;
            head.next = nextNode.next;
            size --;
            return;
        }
        Node prevNode = getNodeByIndex(index - 1);
        Node nextNode = getNodeByIndex(index + 1);
        if(index == size - 1){
            prevNode.next = null;
        }
        else
            prevNode.next = nextNode;
        size --;
    }

    /**
     * Phương thức lấy Node ở vị trí index.
     * @param index
     * @return
     */
    private Node getNodeByIndex(int index) {
        MyIterator searchIter = iterator();
        for(int i = 0; i < index && searchIter.hasNext(); i++) {
            searchIter.next();
        }
        // Ensure the iterator is at the correct position
        if (searchIter instanceof MyLinkedListIterator) {
            return ((MyLinkedListIterator) searchIter).getCurrentNode();
        }
        return null; // or throw an exception if the index is out of bounds
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(0, head);
    }
}
