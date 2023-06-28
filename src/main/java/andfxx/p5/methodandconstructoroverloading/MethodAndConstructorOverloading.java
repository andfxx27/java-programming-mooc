package andfxx.p5.methodandconstructoroverloading;

public class MethodAndConstructorOverloading {
    public static void methodAndConstructorOverloading() {
        System.out.println("Hello world from andfxx.p5.methodandconstructoroverloading");

        overloadedCounter();
    }

    private static void overloadedCounter() {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(100);

        System.out.println(counter1);
        System.out.println(counter2);

        counter1.increase();
        counter2.increase(5);

        System.out.println(counter1);
        System.out.println(counter2);

        counter1.increase(-5);
        counter2.decrease(30);

        System.out.println(counter1);
        System.out.println(counter2);
    }

    private static void constructorOverload() {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }

    private static void constructorOverloadingDemo() {
        Person person1 = new Person("Felix A");
        Person person2 = new Person("Vash Stampede", 23);

        System.out.println(person1);
        System.out.println(person2);
    }
}
