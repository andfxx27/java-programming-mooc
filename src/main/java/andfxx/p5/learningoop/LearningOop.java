package andfxx.p5.learningoop;

public class LearningOop {

    public static void learningOop() {
        System.out.println("Hello world from andfxx.p5.learningoop");

        fitByte();
    }

    private static void fitByte() {
        FitByte fitByte = new FitByte(30, 60);

        double percentage = 0.5;

        while (percentage < 1) {
            double targetHeartRate = fitByte.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + " of maximum heart rate is " + targetHeartRate);
            percentage += 0.1;
        }
    }

    private static void cube() {
        Cube cube1 = new Cube(4);
        System.out.println(cube1.volume());
        System.out.println(cube1);

        Cube cube2 = new Cube(2);
        System.out.println(cube2.volume());
        System.out.println(cube2);
    }

    private static void book() {
        Book book1 = new Book("Masashi Kishimoto", "Naruto Vol. 1", 180);

        System.out.println(book1);
    }

    private static void oneMinute() {
        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);

            timer.advance();

            // Advance timer every hundredth of a second
            // Take notes, Thread.sleep is very inaccurate depending on the os, device, jvm, etc.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
