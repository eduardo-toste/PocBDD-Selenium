package pocSelenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                    System.setProperty("webdriver.edge.driver", "src/main/resources/drivers/msedgedriver.exe");
                    driver = new EdgeDriver();
                    break;

                default:
                    throw new IllegalArgumentException("Navegador não suportado: " + browser);
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
