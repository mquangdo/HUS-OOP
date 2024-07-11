package designpattern.observer.example2;

import java.util.ArrayList;
import java.util.List;

public class ConcretePingSystem implements PingSystem{
    List<Champ> champs;

    public ConcretePingSystem(){
        this.champs = new ArrayList<>();
    }
    @Override
    public void registerChamp(Champ champ) {
        champs.add(champ);
    }
    @Override
    public void removeChamp(Champ champ) {
        champs.add(champ);
    }

    @Override
    public void notifyChamp() {
        for (Champ champ: champs){
            champ.update();
        }
    }

    public void ping(){
        System.out.println("Enemy is missing!!!");
        notifyChamp();
    }
}
