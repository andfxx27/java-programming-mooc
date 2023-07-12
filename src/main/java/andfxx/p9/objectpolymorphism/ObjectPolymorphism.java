package andfxx.p9.objectpolymorphism;

import andfxx.p9.objectpolymorphism.animals.Cat;
import andfxx.p9.objectpolymorphism.animals.Dog;
import andfxx.p9.objectpolymorphism.animals.NoiseCapable;
import andfxx.p9.objectpolymorphism.herds.Herd;
import andfxx.p9.objectpolymorphism.herds.Organism;

public class ObjectPolymorphism {
    public static void objectPolymorphism() {
        System.out.println("Hello world from andfxx.p9.objectpolymorphism");

        animals();
    }

    private static void animals() {
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }

    private static void herds() {
        Herd herd = new Herd();
        herd.addToHerd(new Organism(57, 66));
        herd.addToHerd(new Organism(73, 56));
        herd.addToHerd(new Organism(46, 52));
        herd.addToHerd(new Organism(19, 107));
        System.out.println(herd);
        System.out.println();

        herd.move(5, 5);
        System.out.println(herd);
        System.out.println();
    }
}
