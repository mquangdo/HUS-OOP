package lastterm.year2223.de3.matrix;

public class Test {
    public static void main(String[] args) {
        double[][] mat = initRandom(5);
        System.out.println(print(mat));
        gaussianElimination(mat);
        System.out.println(print(mat));
    }

    private static double[][] initRandom(int size) {
        /* TODO */
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        double[][] data = new double[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                data[i][j] = Math.random() * range;
            }
        }
        return data;
    }

    public static void swapRows(double[][] data, int firstIndex, int secondIndex) {
        /* TODO */
        for (int j = 0; j < data[0].length; j++) {
            double temp = data[firstIndex][j];
            data[firstIndex][j] = data[secondIndex][j];
            data[secondIndex][j] = temp;
        }
    }

    public static void gaussianElimination(double[][] data) {
        /* TODO */
        for (int index = 0; index < data.length; index++) {
            if (data[index][index] == 0) {
                double big = 0.0;
                int kRow = index;

                for (int row = index + 1; row < data.length; row++) {
                    if (Math.abs(data[row][index]) != big) {
                        big = Math.abs(data[row][index]);
                        kRow = row;
                    }
                }
                swapRows(data,index, kRow);
            }

            double pivot = data[index][index];

            for (int row = index + 1; row < data.length; row++) {
                double multiple = data[row][index] / pivot;
                for (int col = index; col < data[0].length; col++) {
                    data[row][col] -= multiple * data[index][col];
                }
            }
        }
    }

    public static String print(double[][] data){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                stringBuilder.append(String.format("%.2f", data[i][j])).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
