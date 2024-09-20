package midterm2021.quest2;
import java.util.*;

public class ListPoly extends AbstractPoly{
    private List<Integer> coefficients;

    public ListPoly(int[] coeffs){
        coefficients = new ArrayList<>();
        for (int coeff: coeffs){
            coefficients.add(coeff);
        }
    }
    @Override
    public int coefficients(int degree) {
        return coefficients.get(degree);
    }

    @Override
    public int[] coefficients() {
        int[] coefficientArr = new int[this.coefficients.size()];
        for (int i = 0; i < this.coefficients.size(); i++){
            coefficientArr[i] = coefficients.get(i);
        }
        return coefficientArr;
    }

    @Override
    public Poly derivative() {
        int[] differentiate = differentiate();
        Poly poly = new ListPoly(differentiate);
        return poly;
    }

    public ListPoly minus(ListPoly polyList){
        for (int i = 0; i < coefficients.size(); i++){
            coefficients.set(i, coefficients.get(i) - coefficients(i));
        }
        return this;
    }

    public ListPoly plus(ListPoly polyList){
        for (int i = 0; i < coefficients.size(); i++){
            coefficients.set(i, coefficients.get(i) + coefficients(i));
        }
        return this;
    }

    private void reduce(){
        for (int i = coefficients.size() - 1; i >= 0; i--){
            if (coefficients.get(i) != 0){
                degree = i;
                break;
            }
            degree = Integer.MIN_VALUE;
        }
    }

    public String type(){
        return "List Poly";
    }
}
