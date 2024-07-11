package hus.oop.lab11.iterator.question3;

public class MyChickenList extends MyList{
    private String[] chickenList;
    public MyChickenList(String[] chickenList){
        this.chickenList = chickenList;
    }
    public void getDescription() {
        System.out.println("ChickenList");
    }

    @Override
    public Iterator createIterator() {
        return new MyChickenListIterator(chickenList);
    }
}
