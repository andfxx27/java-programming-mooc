package andfxx.p11.exceptions.sensorsandtemperatures;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean indicator;

    public TemperatureSensor() {
        this.indicator = false;
    }

    @Override
    public boolean isOn() {
        return indicator;
    }

    @Override
    public void setOn() {
        this.indicator = true;
    }

    @Override
    public void setOff() {
        this.indicator = false;
    }

    @Override
    public int read() {
        if (!this.indicator) {
            throw new IllegalStateException("Sensor is off.");
        }

        return new Random().nextInt(61) - 30;
    }
}
