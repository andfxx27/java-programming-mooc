package andfxx.p11.exceptions.validatingparameters;

public class Calculator {
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Num must be greater than 0.");
        }

        return -1;
    }
}
