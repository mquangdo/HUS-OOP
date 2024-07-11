package designpattern.strategy.example1;

public class PickMode {
    private Champion champion;

    public PickMode(){

    }
    public void setChampion(Champion champion) {
        this.champion = champion;
    }

    public Champion getChampion(){
        return this.champion;
    }
}
