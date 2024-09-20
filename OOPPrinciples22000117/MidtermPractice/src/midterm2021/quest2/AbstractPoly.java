package midterm2021.quest2;

public abstract class AbstractPoly implements Poly{
    protected int degree;
    public AbstractPoly(){
        this.degree = 0;
    }

    public int degree(){
        return this.degree;
    }

    int[] differentiate(){
        int[] currentCoeff = coefficients();
        int[] newCoeff = new int[currentCoeff.length - 1];
        for (int i = 1; i < currentCoeff.length; i++){
            newCoeff[i - 1] = currentCoeff[i];
        }
        return newCoeff;
    }

    public boolean equals(Object o){
        if (o instanceof Poly){
            for (int i = 0; i < coefficients().length; i++){
                if (coefficients()[i] != ((Poly) o).coefficients()[i]){
                    return false;
                }
            }
        }
        return false;
    }

    public double evaluate(double val){
        double result = 0;
        for (int i = coefficients().length - 1; i >= 0; i--){
            result = result * val + coefficients()[i];
        }
        return result;
    }

    public String toString(){
        StringBuilder res = new StringBuilder("Poly[");
        res.append(coefficients()[0]);
        for (int i = 1; i < coefficients().length; i++){
            if (coefficients()[i] != 0){
                if (coefficients()[i] > 0){
                    if (i == 1){
                        res.append(" + " + coefficients()[i] + "x");
                    }
                    else {
                        res.append(" + " + coefficients()[i] + "x^" + i);
                    }
                }
                else {
                    res.append(" - " + (- coefficients()[i]) + "x^" + i);
                }
            }
        }
        res.append("]");
        return res.toString();
    }
}
