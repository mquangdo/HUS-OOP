package hus.oop.lab10.question2.ex3;

public class Shooter {
    private static Shooter instance;
    private int ammo;

    private Shooter(int ammo){
        System.out.println("Ready, finding targets...");
        this.ammo = ammo;
    }

   public static Shooter getInstance(){
        if (Shooter.instance == null){
            instance = new Shooter(5);
        }
        return instance;
    }

    public void shoot(){
        System.out.println("Shooting, " + this.ammo + " bullets left...");
        this.ammo -= 1;
        if (this.ammo == 0){
            reload();
        }
    }

    public void reload(){
        this.ammo += 5;
    }
}
