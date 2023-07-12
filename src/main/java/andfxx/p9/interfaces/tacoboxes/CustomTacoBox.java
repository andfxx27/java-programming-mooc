package andfxx.p9.interfaces.tacoboxes;

public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacosRemaining() > 0) {
            tacos--;
        }
    }

    @Override
    public String toString() {
        return "Remaining tacos: " + tacosRemaining();
    }
}
