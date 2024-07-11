package hus.oop.lab11.decorator.question2;

public class Client {
    public static void main(String[] args) {
        VanillaIceCream vanilla = new VanillaIceCream();
        IceCream strawberry = new StrawBerryIceCream();

        System.out.println(vanilla.getDescription());
        System.out.println(strawberry.getDescription());

        HoneyToppingDecorator honeyVanilla = new HoneyToppingDecorator(vanilla);
        NutsToppingDecorator nutsStrawberry = new NutsToppingDecorator(strawberry);
        System.out.println(honeyVanilla.getDescription());
        System.out.println(nutsStrawberry.getDescription());
    }
}
