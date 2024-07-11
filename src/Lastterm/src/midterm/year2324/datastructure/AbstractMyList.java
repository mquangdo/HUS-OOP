package midterm.year2324.datastructure;

public abstract class AbstractMyList implements MyList {
    /**
     * Phương thức kiểm tra xem index có nằm trong đoạn [0 - limit] không.
     * @param index
     * @param limit
     * @return
     */
    public boolean checkBoundaries(int index, int limit) {
        /* TODO */
        if (index < 0 || index > limit){
            return false;
        }
        return true;
    }

    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu theo định dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size() - 1; i++){
            stringBuilder.append(get(i)).append(", ");
        }
        stringBuilder.append(get(size() - 1)).append("]");
        return stringBuilder.toString();
    }
}
