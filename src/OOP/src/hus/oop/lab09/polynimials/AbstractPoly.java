package hus.oop.lab09.polynimials;

import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractPoly implements Poly{
    public static void main(String[] args) {

    }
    public AbstractPoly(){

    }

    double[] derive(){
        double[] curCoeffs = coefficients();
        for (int i = 0; i < curCoeffs.length; i++){
            double newCoeff = curCoeffs[i] * i;
            curCoeffs[i] = newCoeff;
        }
        double[] newCoeffs = new double[curCoeffs.length - 1];
        for (int i = 0; i < newCoeffs.length; i++){
            newCoeffs[i] = curCoeffs[i + 1];
        }
        return newCoeffs;
    }
    @Override
    public int hashCode(){
        return Objects.hashCode(coefficients());
    }

    public  String toString(){
        double[] curCoeff = coefficients();
        StringBuilder sb = new StringBuilder();
        sb.append(curCoeff[0]);
        for (int i = 1; i < curCoeff.length; i++){
            if (curCoeff[i] != 0){
                if(i == 1){
                    sb.append(" + " + curCoeff[i] + "x");
                }
                else {
                   if (curCoeff[i] > 0){
                       sb.append(" + " + curCoeff[i] + "x^" + i);
                   }
                   else {
                       sb.append(" - " + (- curCoeff[i]) + "x^" + i);
                   }
                }
            }
        }
        return sb.toString();
    }

}
