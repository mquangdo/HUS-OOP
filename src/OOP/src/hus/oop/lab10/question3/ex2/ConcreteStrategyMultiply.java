package hus.oop.lab10.question3.ex2;

public class ConcreteStrategyMultiply implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
