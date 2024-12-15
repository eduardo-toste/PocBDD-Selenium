package pocSelenium.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pocSelenium.utils.DriverManager;

import java.io.File;
import java.io.IOException;

public class Hooks {
    WebDriver driver;

    @Before
    public void setup() {
        driver = DriverManager.getDriver("chrome");
        driver.get("https://ultimateqa.com/automation");
    }

    @After
    public void teardown() {
        DriverManager.quitDriver();
    }

    @AfterStep
    public void takeScreenshotAfterStep(Scenario scenario) {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            String screenshotName = scenario.getName().replaceAll(" ", "_") + "_" + System.currentTimeMillis();
            FileUtils.copyFile(file, new File("target/reports/screenshots/" + screenshotName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}