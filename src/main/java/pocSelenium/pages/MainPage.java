package pocSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    // Seletores
    private By interactionsLink = By.linkText("Interactions with simple elements");
    private By loginPageLink = By.linkText("Go to login page");
    private By pageHeading = By.className("page__heading");

    // Construtor
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos
    public void clickInteractionsLink() {
        driver.findElement(interactionsLink).click();
    }

    public void clickLoginPageLink() {
        driver.findElement(loginPageLink).click();
    }

    public String getPageHeadingText() {
        return driver.findElement(pageHeading).getText();
    }
}
