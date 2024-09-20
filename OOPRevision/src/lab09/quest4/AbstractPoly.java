package lab09.quest4;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    public AbstractPoly() {

    }

    double[] derive() {
        double[] differentiate = new double[coefficients().length - 1];
        for (int i = 0; i < differentiate.length; i++) {
            differentiate[i] = coefficients()[i + 1] * i;
        }
        return differentiate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof Poly){
            if (coefficients().length == ((Poly) o).coefficients().length){
                for (int i = 0; i < coefficients().length; i++){
                    if (this.coefficients()[i] != ((Poly) o).coefficients()[i]){
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode(){
        return Objects.hashCode(coefficients());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(coefficients()[0]);

        for (int i = 1; i < coefficients().length; i++){
            if (coefficients()[i] != 0){
                if (i == 1){
                    if (coefficients()[i] > 0){
                        sb.append(" + " + coefficients()[i] + "x");
                    }
                    else {
                        sb.append(" - " + (- coefficients()[i]) + "x");
                    }
                }
                else {
                    if (coefficients()[i] > 0){
                        sb.append(" + " + coefficients()[i] + "x^" + i);
                    }
                    else {
                        sb.append(" - " + (- coefficients()[i]) + "x^" + i);
                    }
                }
            }
        }
        return sb.toString();
    }
}
