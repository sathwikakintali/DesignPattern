public class ObserverPattern {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();

        weatherData.registerObserver(tempDisplay);
        weatherData.registerObserver(humidityDisplay);

        weatherData.setMeasurements(25.5f, 65.0f);
        weatherData.setMeasurements(27.0f, 70.0f);
    }
}
