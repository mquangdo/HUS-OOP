package designpattern.observer.example1;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(70,67,29.3f);
        weatherData.setMeasurements(90, 56,30.1f);
        weatherData.setMeasurements(89,72,27.6f);
    }
}
