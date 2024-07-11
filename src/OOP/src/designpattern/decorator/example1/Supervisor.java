package designpattern.decorator.example1;

public class Supervisor {
    public static void main(String[] args) {
        Troop shooter = new ShooterTroop();
        System.out.println(shooter.getDescription());
        Troop shooterSuit = new ShooterSuit(shooter);
        System.out.println(shooterSuit.getDescription());
    }
}
