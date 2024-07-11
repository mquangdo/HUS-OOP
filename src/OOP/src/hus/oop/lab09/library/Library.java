package hus.oop.lab09.library;

import javax.swing.plaf.LabelUI;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents){
        this.rents = rents;
    }

    public Rent getLongestRent(){
        long longest = -1;
        int longestPos = -1;
        for (int i = 0; i < rents.length; i++){
            long timeRent = rents[i].getEnd().getTime() - rents[i].getBegin().getTime();
            if (timeRent > longest){
                longest = timeRent;
                longestPos = i;
            }
        }
        return rents[longestPos];
    }
}
