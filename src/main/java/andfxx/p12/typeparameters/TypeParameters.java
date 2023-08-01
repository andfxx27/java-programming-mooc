package andfxx.p12.typeparameters;

import andfxx.p12.typeparameters.hideout.Hideout;
import andfxx.p12.typeparameters.pipe.Pipe;

public class TypeParameters {
    public static void typeParameters() {
        System.out.println("Hello world from andfxx.p12.typeparameters");

        pipe();
    }

    private static void pipe() {
        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
    }

    private static void hideout() {
        Hideout<Integer> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout(1);
        System.out.println(den.isInHideout());
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
    }

    private static void genericDemo() {
        Locker<String> stringLocker = new Locker<>("Oregairu");

        System.out.println(stringLocker.getElement());
    }

    static class Locker<T> {
        private final T element;

        public Locker(T element) {
            this.element = element;
        }

        public T getElement() {
            return element;
        }
    }
}
