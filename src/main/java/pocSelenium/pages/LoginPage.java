package pocSelenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Seletores
    private By emailField = By.id("user[email]");
    private By passwordField = By.id("user[password]");
    private By emailError = By.id("user[email]-error");
    private By passwordError = By.id("user[password]-error");
    private By invalidLoginError = By.xpath("//li[@class='form-error__list-item']");
    private By signInButton = By.xpath("//button[@data-sitekey='6LdnNvYpAAAAAO9SKKhiP8DgM1q2glG4mI3iyjzP']");
    private By loggedInUserButton = By.xpath("//button[normalize-space()='Rodrigo G']");

    // Construtor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public void clickEmailField() {
        driver.findElement(emailField).click();
    }

    public void clickPasswordField() {
        driver.findElement(passwordField).click();
    }

    public String getEmailErrorText() {
        return driver.findElement(emailError).getText();
    }

    public String getPasswordErrorText() {
        return driver.findElement(passwordError).getText();
    }

    public String getInvalidLoginErrorText() {
        return driver.findElement(invalidLoginError).getText();
    }

    public String getLoggedInUserName() {
        return driver.findElement(loggedInUserButton).getText();
    }
}
