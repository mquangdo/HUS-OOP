package hus.oop.lab08.question5;

public class AfricaCountry extends Country{
    private int population;
    private double area;
    private double gdp;

    public AfricaCountry(String code, String name, int population, double area, double gdp) {
        super(code, name);
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    public int getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public double getGdp() {
        return gdp;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "AfricaCountry{" +
                "population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                '}';
    }
}
