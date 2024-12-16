package pocSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage {
    private WebDriver driver;

    // Seletores
    private By buttonById = By.id("idExample");
    private By buttonByLinkText = By.linkText("Click me using this link text!");
    private By buttonByClassName = By.className("buttonClass");
    private By buttonByName = By.name("button1");
    private By successMessage = By.className("entry-title");

    // Construtor
    public ButtonsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos
    public void clickButtonById() {
        driver.findElement(buttonById).click();
    }

    public void clickButtonByLinkText() {
        driver.findElement(buttonByLinkText).click();
    }

    public void clickButtonByClassName() {
        driver.findElement(buttonByClassName).click();
    }

    public void clickButtonByName() {
        driver.findElement(buttonByName).click();
    }

    public String getSuccessMessageText() {
        return driver.findElement(successMessage).getText();
    }
}
