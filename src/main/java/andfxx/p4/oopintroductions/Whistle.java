package andfxx.p4.oopintroductions;

public class Whistle {
    private final String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(this.sound);
    }
}
