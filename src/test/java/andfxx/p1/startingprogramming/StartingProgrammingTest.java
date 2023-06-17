package andfxx.p1.startingprogramming;

import andfxx.p1.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartingProgrammingTest extends BaseTest {
    @Test
    void startingProgramming() {
        StartingProgramming.startingProgramming();

        Assertions.assertEquals("Hello world from andfxx.p1.startingprogramming", outputStreamCaptor.toString().trim());
    }
}
