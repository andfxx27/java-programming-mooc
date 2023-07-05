package andfxx.p7.largerexercises.bigyear;

import java.util.ArrayList;
import java.util.List;

public class BigYear {
    private final List<Bird> birds;

    public BigYear() {
        this.birds = new ArrayList<>();
    }

    private void displayBird(Bird bird) {
        System.out.println(bird.getName() + "(" + bird.getLatinName() + "): " + bird.getObservationCount() + " observations");
    }

    public void addBird(Bird bird) {
        if (!this.birds.contains(bird)) {
            this.birds.add(bird);
        }
    }

    public boolean observation(String name) {
        boolean exists = false;

        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                exists = true;
                bird.setObservationCount(bird.getObservationCount() + 1);
            }
        }

        return exists;
    }

    public void all() {
        for (Bird bird : this.birds) {
            displayBird(bird);
        }
    }

    public void one(String name) {
        boolean exists = false;

        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                exists = true;
                displayBird(bird);
            }
        }

        if (!exists) {
            System.out.println("No bird found!");
        }
    }
}
