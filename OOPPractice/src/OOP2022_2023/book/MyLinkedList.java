package OOP2022_2023.book;

import OOP2023_2024.datastructure.Node;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
        head = null;
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        if (index < 0 || index > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        return getNodeByIndex(index).getPayload();
    }

    /**
     * Sửa phần tử ở vị trí index là payload.
     * @param payload
     * @param index
     */
    @Override
    public void set(Object payload, int index) {
        /* TODO */
        if (index < 0 || index > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0 && index == size - 1) {
            head = new MyLinkedListNode(payload);
            return;
        }

        if (index == 0) {
            MyLinkedListNode afterNode = getNodeByIndex(index + 1);
            MyLinkedListNode newNode = new MyLinkedListNode(payload);
            head = newNode;
            newNode.setNext(afterNode);
            return;
        }

        if (index == size - 1) {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            MyLinkedListNode currentNode = new MyLinkedListNode(payload);
            previousNode.setNext(currentNode);
            return;
        }

        MyLinkedListNode previousNode = getNodeByIndex(index - 1);
        MyLinkedListNode afterNode = getNodeByIndex(index + 1);
        MyLinkedListNode currentNode = new MyLinkedListNode(payload);
        previousNode.setNext(currentNode);
        currentNode.setNext(afterNode);
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == 0 && index == size - 1) {
            head = null;
            size--;
            return;
        }

        if (index == 0) {
            MyLinkedListNode afterNode = getNodeByIndex(index + 1);
            head = afterNode;
            size--;
            return;
        }

        if (index == size - 1) {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            previousNode.setNext(null);
            size--;
            return;
        }
        MyLinkedListNode previous = getNodeByIndex(index - 1);
        MyLinkedListNode after = getNodeByIndex(index + 1);
        previous.setNext(after);
        size--;
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        if (size == 0) {
            head = new MyLinkedListNode(payload);
            size++;
            return;
        }

        MyLinkedListNode lastNode = getNodeByIndex(size - 1);
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        lastNode.setNext(newNode);
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if (index == 0){
            head = new MyLinkedListNode(payload, head);
        }
        else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            MyLinkedListNode newNode = new MyLinkedListNode(payload, current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(head);
    }

    /**
     * Lấy node ở vị trí index.
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        MyLinkedListNode temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp;
    }
}
