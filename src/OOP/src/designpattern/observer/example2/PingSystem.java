package designpattern.observer.example2;

public interface PingSystem {
    void registerChamp(Champ champ);
    void removeChamp(Champ champ);
    void notifyChamp();
}
