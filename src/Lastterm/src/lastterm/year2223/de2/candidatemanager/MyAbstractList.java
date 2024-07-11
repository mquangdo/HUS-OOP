package lastterm.year2223.de2.candidatemanager;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    public void checkIndex(int index, int limit){
        if (index < 0 || index > limit){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size(); i++){
            stringBuilder.append(String.format("[%s]", get(i)));
        }
        return stringBuilder.toString();
    }
}
