package andfxx.p11.exceptions;

import andfxx.p11.exceptions.sensorsandtemperatures.AverageSensor;
import andfxx.p11.exceptions.sensorsandtemperatures.Sensor;
import andfxx.p11.exceptions.sensorsandtemperatures.StandardSensor;
import andfxx.p11.exceptions.sensorsandtemperatures.TemperatureSensor;
import andfxx.p11.exceptions.statistics.Statistics;
import andfxx.p11.exceptions.validatingparameters.Calculator;
import andfxx.p11.exceptions.validatingparameters.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exceptions {
    public static void exceptions() {
        System.out.println("Hello world from andfxx.p11.exceptions");

        sensorsAndTemperature();
    }

    private static void sensorsAndTemperature() {
        Sensor kumpula = new TemperatureSensor();
        Sensor kaisaniemi = new TemperatureSensor();
        Sensor helsinkiVantaaAirport = new TemperatureSensor();

        AverageSensor helsinkiRegion = new AverageSensor();
        helsinkiRegion.addSensor(kumpula);
        helsinkiRegion.addSensor(kaisaniemi);
        helsinkiRegion.addSensor(helsinkiVantaaAirport);

        helsinkiRegion.setOn();
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        System.out.println("readings: " + helsinkiRegion.readings());
    }

    private static void generateRandomNumbers() {
        int currentValue = 0;
        int targetValue = 10000;
        int numbersCountLimit = 1000;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbersCountLimit; i++) {
            Random random = new Random();
            int val = random.nextInt(20) + 1;

            currentValue += val;

            if (currentValue >= targetValue) {
                break;
            }

            list.add(val);
        }

        // Value < 10000

        list.add(targetValue - (list.stream().mapToInt(Integer::intValue).sum()));

        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.size());
    }

    private static void statistics() {
        Statistics st = new Statistics();
        System.out.println("Printing the average of the statistics: " + st.average());
        System.out.println("Adding number 22");
        st.add(22);
        System.out.println("Printing the average of the statistics: " + st.average());
    }

    private static void validatingParameters() {
        Person person = new Person("Felix", 23);

        System.out.println(person);

        System.out.println(Calculator.factorial(0));
    }

    private static void runtimeExceptionDemo() {
        Grade grade = new Grade(-1);
        System.out.println(grade.getGrade());
    }

    private static void throwExceptionDemoCaller() {
        try {
            throwExceptionDemo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void throwExceptionDemo() throws Exception {
        System.out.println("Execute throwExceptionDemo");
    }
}
