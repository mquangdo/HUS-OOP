package question3;

public class MyLinkedList extends MyAbstractList{
    private MyLinkedList head;
    private int size;
    public MyLinkedList(){
        this.head = null;
        this.size = 0;

    }

    public void append(Object obj){

    }

    public Object get(int index){
        return getNodeByIndex(index);
    }

    private MyLinkedListNode getNodeByIndex(int index){
        return null;
    }

    public void insert(Object obj, int index){

    }

    public MyIterator iterator(){
        return null;
    }

    public void remove(int index){

    }

    @Override
    public int size(){
        return this.size;
    }
}
