package hus.oop.vector;

public abstract class AbstractMyVector implements MyVector {
    /**
     * Mô tả vector theo định dạng [a1 a2 ... an]
     * @return
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size(); i++){
            stringBuilder.append(String.format("%.2f",coordinates()[i])).append(" ");
            if (i == size() - 1){
                stringBuilder.append(coordinates()[i]).append("]");
            }
        }
        return stringBuilder.toString();

    }

    /**
     * So sánh hai vector có bằng nhau không.
     * Hai vector bằng nhau nếu có cùng số chiều và có các phần tử bằng nhau.
     * @param another
     * @return
     */
    @Override
    public boolean equals(MyVector another) {
        /* TODO */
        if (this.size() == another.size()){
            for (int i = 0; i < size(); i++){
                if (coordinates()[i] != another.coordinates()[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public void checkIndex(int index, int limit){
        if (index < 0 || index > limit){
            throw new ArrayIndexOutOfBoundsException();
        }
        return;
    }
}
