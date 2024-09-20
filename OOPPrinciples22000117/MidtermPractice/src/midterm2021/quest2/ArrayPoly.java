package midterm2021.quest2;

public class ArrayPoly extends AbstractPoly{
    private int[] coefficients;

    public ArrayPoly(int[] coefficients){
        this.coefficients = coefficients;
    }

    @Override
    public int coefficients(int degree) {
        return coefficients[degree];
    }

    @Override
    public int[] coefficients() {
        return this.coefficients;
    }

    @Override
    public Poly derivative() {
        int[] differentiate = differentiate();
        Poly poly = new ListPoly(differentiate);
        return poly;
    }

    public ArrayPoly minus(ListPoly polyList){
        for (int i = 0; i < coefficients.length; i++){
            coefficients[i] -= polyList.coefficients(i);
        }
        return this;
    }

    public ArrayPoly plus(ListPoly polyList){
        for (int i = 0; i < coefficients.length; i++){
            coefficients[i] += polyList.coefficients(i);
        }
        return this;
    }

    private void reduce(){
        for (int i = coefficients.length - 1; i >= 0; i--){
            if (coefficients[i] != 0){
                degree = i;
                break;
            }
            degree = Integer.MIN_VALUE;
        }
    }

    public String type(){
        return "Array Poly";
    }
}
