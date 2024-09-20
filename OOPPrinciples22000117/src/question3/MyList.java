package question3;

interface MyList extends MyIterable{
    public void append(Object obj);
    public Object get(int index);
    public void insert(Object obj, int index);
    public void remove(int index);
    public int size();
}
