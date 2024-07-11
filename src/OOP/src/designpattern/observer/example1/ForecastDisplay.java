package designpattern.observer.example1;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure;
    private float lastPressure;
    private int numReadings = 0;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        if (Float.compare(currentPressure, lastPressure) > 0){
            System.out.println("Improving weather on the way!");
        } else if (Float.compare(currentPressure, lastPressure) < 0){
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        numReadings += 1;
        display();
    }
}
