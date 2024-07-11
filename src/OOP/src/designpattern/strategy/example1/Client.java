package designpattern.strategy.example1;

public class Client {
    public static void main(String[] args) {
        Champion Zed = new Zed();
        Champion Lucian = new Lucian();
        PickMode pickMode = new PickMode();
        pickMode.setChampion(Zed);
        pickMode.getChampion().R();
        pickMode.setChampion(Lucian);
        pickMode.getChampion().R();
        pickMode.getChampion().lane();
    }
}
