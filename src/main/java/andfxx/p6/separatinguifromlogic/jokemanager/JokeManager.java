package andfxx.p6.separatinguifromlogic.jokemanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeManager {
    private final List<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        if (!this.jokes.contains(joke)) {
            this.jokes.add(joke);
        }
    }

    public String drawJoke() {
        if (this.jokes.size() == 0) {
            return "Jokes are in short supply.";
        }

        Random random = new Random();

        int idx = random.nextInt(this.jokes.size());

        return this.jokes.get(idx);
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
