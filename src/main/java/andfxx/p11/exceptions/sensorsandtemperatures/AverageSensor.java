package andfxx.p11.exceptions.sensorsandtemperatures;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private final List<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public List<Integer> readings() {
        return this.sensors.stream().mapToInt(Sensor::read).boxed().toList();
    }

    @Override
    public boolean isOn() {
        int onCount = 0;

        for (Sensor sensor : this.sensors) {
            if (sensor.isOn()) {
                onCount++;
            }
        }

        return onCount == this.sensors.size();
    }

    @Override
    public void setOn() {
        for (Sensor sensor : this.sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : this.sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (!isOn() || this.sensors.isEmpty()) {
            throw new IllegalStateException("All sensors must be on, with at least 1 sensor.");
        }

        return (int) this.sensors.stream().mapToInt(Sensor::read).average().getAsDouble();
    }
}
