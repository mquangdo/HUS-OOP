package question3;

abstract class MyAbstractList implements MyList{
    public MyAbstractList(){

    }

    @Override
    public String toString() {
        /* TODO */
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            s.append(String.format("[%s]", get(i).toString()));
        }
        return s.toString();
    }

}
