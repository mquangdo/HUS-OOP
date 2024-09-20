package question2;

interface DataSet {
    public void append(double num);
    public double element(int num);
    public double[] elements(int num1, int num2);
    public void insert(double num, int index);
    public void remove(double num);
    public void remove(int index);
    public int size();
}
