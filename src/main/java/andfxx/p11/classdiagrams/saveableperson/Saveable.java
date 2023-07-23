package andfxx.p11.classdiagrams.saveableperson;

public interface Saveable {
    void save();
    void delete();
    void load(String address);
}
