package lab09.quest1;

public class Library {
    Rent[] rents;
    public Library(Rent[] rents){
        this.rents = rents;
    }

    public Rent getLongestRent(){
        int pos = 0;
        long longestRent = -1;
        for (int i = 0; i < this.rents.length; i++){
            long temp = this.rents[i].getEnd().getTime() - this.rents[i].getBegin().getTime();
            if (temp > longestRent){
                pos = i;
            }
        }
        return rents[pos];
    }
}
