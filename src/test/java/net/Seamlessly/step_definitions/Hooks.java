package net.Seamlessly.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.Seamlessly.utulities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After()
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs( OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()+" screenshot ");

        }

        Driver.closeDriver();
    }
}
