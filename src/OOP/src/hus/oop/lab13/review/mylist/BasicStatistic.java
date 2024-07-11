package hus.oop.lab13.review.mylist;

public class BasicStatistic {
    private MyList data;

    /**
     * Khởi tạo dữ liệu cho BasicStatistic.
     */
    public BasicStatistic(MyList data) {
        /* TODO */
        this.data = data;
    }

    /**
     * Lấy giá trị lớn nhất trong list.
     * @return giá trị lớn nhất.
     */
    public double max() {
        /* TODO */
        double max = Double.MIN_VALUE;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()){
            if ((double)iterator.next() > max){
                max = (double)iterator.next();
            }
        }
        return max;
    }

    /**
     * Lấy giá trị nhỏ nhất trong list.
     * @return giá trị nhỏ nhất.
     */
    public double min() {
        /* TODO */
        double min = Double.MAX_VALUE;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()){
            if ((double)iterator.next() < min){
                min = (double)iterator.next();
            }
        }
        return min;
    }

    /**
     * Tính kỳ vọng của mẫu lưu trong list.
     * @return kỳ vọng.
     */
    public double mean() {
        /* TODO */
        double sum = 0;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()){
            sum += (double)iterator.next();
        }
        return sum / data.size();
    }

    /**
     * Tính phương sai của mẫu lưu trong list.
     * @return phương sai.
     */
    public double variance() {
        /* TODO */
        double mean = mean();
        double res = 0;
        MyIterator iterator = data.iterator();
        while (iterator.hasNext()){
            res += ((double)iterator.next() - mean) * ((double)iterator.next() - mean);
        }
        return res / data.size();
    }
}
