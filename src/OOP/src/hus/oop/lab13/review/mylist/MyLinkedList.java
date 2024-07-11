package hus.oop.lab13.review.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    private class MyLinkedListIterator implements MyIterator{
        private int currentPosition;

        public MyLinkedListIterator(int currentPosition){
            this.currentPosition = currentPosition;
        }

        @Override
        public boolean hasNext() {
            return currentPosition < size - 1;
        }

        @Override
        public Object next() {
            if (hasNext()){
                Object temp = getNodeByIndex(currentPosition);
                currentPosition++;
                return temp;
            }
            return null;
        }
    }

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyLinkedList() {
        /* TODO */
        this.head = null;
        this.size = 0;
    }

    /**
     * Lấy kích thước của list.
     *
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return this.size;
//        int count = 0;
//        MyLinkedListNode currentNode = this.head;
//        while (currentNode != null){
//            currentNode = currentNode.getNext();
//            count++;
//        }
//        return count;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        MyLinkedListNode indexNode = getNodeByIndex(index);
        if (indexNode == null){
            return null;
        }
        return indexNode.getPayload();
    }

    /**
     * Xóa phần tử của list ở vị trí index.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index >= size){
            return;
        }
        if (index == 0) {
            if (this.head == null){
                return;
            }
            MyLinkedListNode nextNode = this.head.getNext();
            if (nextNode == null){
                this.head = null;
                return;
            }
            this.head = nextNode;
        }
        if (index == size - 1){
            MyLinkedListNode prevNode = getNodeByIndex(index - 1);
            if (prevNode == null){
                return;
            }
            prevNode.setNext(null);
        }

        MyLinkedListNode prevNode = getNodeByIndex(index - 1);
        MyLinkedListNode afterNode = prevNode.getNext().getNext();
        prevNode.setNext(afterNode);
    }

    /**
     * Thêm vào cuối list phần tử có dữ liệu payload.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        if (size == 0) {
            head = new MyLinkedListNode(payload);
        } else {
            MyLinkedListNode lastNode = getNodeByIndex(size - 1);
            lastNode.setNext(new MyLinkedListNode(payload, null));
        }
        size++;
    }

    /**
     * Thêm vào list phần tử có dữ liệu payload ở vị trí index.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        checkIndex(index, size);
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else if (index == size) {
            append(payload);
        } else {
            MyLinkedListNode prev = getNodeByIndex(index - 1);
            MyLinkedListNode cur = getNodeByIndex(index);
            prev.setNext(newNode);
            newNode.setNext(cur);
        }
        size++;
    }

    /**
     * Tạo iterator để cho phép duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyLinkedListIterator(0);
    }

    /**
     * Lấy node ở vị trí index.
     *
     * @param index
     * @return
     */
    private MyLinkedListNode getNodeByIndex(int index) {
        /* TODO */
        if (index < 0 || index >= size){
            return null;
        }
        MyLinkedListNode temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp;
    }
}
