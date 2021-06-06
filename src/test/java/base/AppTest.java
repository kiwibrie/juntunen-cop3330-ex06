package base;

import org.junit.Assert;
import org.junit.Test;


class AppTest {
    @Test
    public void generateOutputTest() {
        App myApp = new App();
        String curAge = "25";
        String retAge = "65";
        int retYear = 65-25;

        String expectedOutput = "You have 40 years left until you can retire.\n" +
                "It's 2021, so you can retire in " + retYear + ".";
        String actualOutput = myApp.generateOutput(curAge, retAge);

        Assert.assertEquals(expectedOutput, actualOutput);

    }
}