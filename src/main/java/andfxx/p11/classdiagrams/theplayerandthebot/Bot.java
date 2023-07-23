package andfxx.p11.classdiagrams.theplayerandthebot;

public class Bot extends Player {
    @Override
    public void play() {
        System.out.println("Bot plays.");
    }

    public void addMove(String move) {
        System.out.println("Bot " + move);
    }
}
