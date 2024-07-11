package designpattern.observer.example1;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxTemp;
    private float minTemp;
    private float tempSum;
    private int numReadings = 0;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        if (temp > maxTemp){
            maxTemp = temp;
        }
        if (temp < minTemp){
            minTemp = temp;
        }
        numReadings += 1;
        display();
    }
}
