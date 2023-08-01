package andfxx.p12.typeparameters.hideout;

public class Hideout<T> {
    private T itemToHide;

    public Hideout() {
        this.itemToHide = null;
    }

    public void putIntoHideout(T itemToHide) {
        this.itemToHide = itemToHide;
    }

    public T takeFromHideout() {
        T temp = this.itemToHide;
        this.itemToHide = null;
        return temp;
    }

    public boolean isInHideout() {
        return this.itemToHide != null;
    }
}
