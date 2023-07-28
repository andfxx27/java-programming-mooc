package andfxx.p11.exceptions.sensorsandtemperatures;

public class StandardSensor implements Sensor {
    private final boolean indicator;
    private final int temperature;

    public StandardSensor(int temperature) {
        this.indicator = true;
        this.temperature = temperature;
    }

    public boolean isIndicator() {
        return indicator;
    }

    @Override
    public boolean isOn() {
        return indicator;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return temperature;
    }
}
