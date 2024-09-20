package question3;

public class MyLinkedListIterator implements MyIterator{
    private MyLinkedListNode currentNode;
    public MyLinkedListIterator(MyLinkedListNode node){
        this.currentNode = node;
    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
