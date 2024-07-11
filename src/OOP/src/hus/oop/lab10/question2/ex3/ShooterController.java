package hus.oop.lab10.question2.ex3;

public class ShooterController {
    public static void main(String[] args) {
        Shooter shooter = Shooter.getInstance();
        shooter.shoot();
        shooter.shoot();
        Shooter shooter1 = Shooter.getInstance();
        shooter1.shoot();
        shooter1.shoot();
        shooter1.shoot();
        shooter1.shoot();
        Shooter.getInstance().shoot();
    }
}
