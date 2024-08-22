public class TemperatureDisplay implements Observer {
    private float temperature;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}

