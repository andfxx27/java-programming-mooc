package andfxx.p11.exceptions.sensorsandtemperatures;

public interface Sensor {
    boolean isOn();
    void setOn();
    void setOff();
    int read();
}
