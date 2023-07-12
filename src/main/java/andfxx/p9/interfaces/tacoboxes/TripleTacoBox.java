package andfxx.p9.interfaces.tacoboxes;

public class TripleTacoBox implements TacoBox {
    private String name = "TripleTacoBox!";
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    public String getName() {
        return name;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (tacosRemaining() > 0) {
            this.tacos--;
        }
    }

    @Override
    public String toString() {
        return "Remaining tacos: " + tacosRemaining();
    }
}
