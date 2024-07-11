package designpattern.observer.example2;

public class Game {
    public static void main(String[] args) {
        ConcretePingSystem pingSystem = new ConcretePingSystem();
        Champ zed = new Zed();
        Champ lucian = new Lucian();
        Champ darius = new Darius();
        pingSystem.registerChamp(zed);
        pingSystem.registerChamp(lucian);
        pingSystem.registerChamp(darius);
        pingSystem.ping();
    }
}
