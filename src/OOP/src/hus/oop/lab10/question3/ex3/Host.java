package hus.oop.lab10.question3.ex3;

public class Host {
    private Sort strategy;

    public Host() {

    }

    public void setStrategy(Sort algorithm) {
        strategy = algorithm;
    }

    public int[] sort(int[] a) {
        return strategy.sort(a);
    }
}
