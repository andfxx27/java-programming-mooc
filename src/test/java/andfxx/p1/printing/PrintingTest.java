package andfxx.p1.printing;

import andfxx.p1.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrintingTest extends BaseTest {
    @Test
    void adaLovelace_printAdaLovelace() {
        Printing.adaLovelace();

        Assertions.assertEquals("Ada Lovelace", outputStreamCaptor.toString().trim());
    }

    @Test
    void hiAdaLovelace_printHiAdaLovelace() {
        Printing.hiAdaLovelace();

        Assertions.assertEquals("Hi Ada Lovelace", outputStreamCaptor.toString().trim());
    }

    @Test
    void dinosaur_printDinosaurMultiline() {
        Printing.dinosaur();

        Assertions.assertEquals("Once upon a time\r\nthere was\r\na dinosaur", outputStreamCaptor.toString().trim());
    }

    @Test
    void onceUponATime_printOnceUponATimeMultiline() {
        Printing.onceUponATime();

        Assertions.assertEquals("Once upon a time\r\nthere was\r\na program", outputStreamCaptor.toString().trim());
    }
}
