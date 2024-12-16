package pocSelenium.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pocSelenium.pages.LoginPage;
import pocSelenium.pages.MainPage;
import pocSelenium.utils.DriverManager;
import pocSelenium.utils.Delay;

public class LoginSteps {
    private WebDriver driver = DriverManager.getDriver("chrome");
    private MainPage mainPage = new MainPage(driver);
    private LoginPage loginPage = new LoginPage(driver);
    private Delay delay = new Delay();

    @Given("que eu estou na página principal de automação")
    public void que_eu_estou_na_página_principal_de_automação() {
        Assert.assertEquals("https://ultimateqa.com/automation", driver.getCurrentUrl());
    }

    @Given("eu acesso a opção Interactions with simple elements")
    public void eu_acesso_a_opção_interactions_with_simple_elements() {
        mainPage.clickInteractionsLink();
    }

    @When("eu clico na opção Go to login page")
    public void eu_clico_na_opção_go_to_login_page() {
        delay.delay(500);
        mainPage.clickLoginPageLink();
    }

    @Then("sou redirecionado para a página de login")
    public void sou_redirecionado_para_a_página_de_login() {
        String texto = mainPage.getPageHeadingText();
        Assert.assertEquals("Welcome Back!", texto);
    }

    @When("clico em Sign in")
    public void clico_em_sign_in() {
        loginPage.clickSignIn();
    }

    @When("clico no campo de e-mail")
    public void clico_no_campo_de_e_mail() {
        loginPage.clickEmailField();
    }

    @When("clico no campo senha e clico fora do campo")
    public void clico_no_campo_senha_e_clico_fora_do_campo() {
        loginPage.clickPasswordField();
        loginPage.clickEmailField();
    }

    @Then("é apresentado um erro para cada campo")
    public void é_apresentado_um_erro_para_cada_campo() {
        Assert.assertEquals("Please enter a valid email address", loginPage.getEmailErrorText());
        Assert.assertEquals("This field cannot be blank", loginPage.getPasswordErrorText());
    }

    @Then("o login é recusado e apresenta o erro")
    public void o_login_é_recusado_e_apresenta_o_erro() {
        delay.delay(2000);
        Assert.assertEquals("Invalid email or password.", loginPage.getInvalidLoginErrorText());
    }

    @When("insiro o e-mail {string}")
    public void insiro_o_e_mail(String email) {
        loginPage.enterEmail(email);
    }

    @When("insiro a senha {string}")
    public void insiro_a_senha(String senha) {
        loginPage.enterPassword(senha);
    }

    @Then("o login é aceito")
    public void o_login_é_aceito() {
        delay.delay(500);
        Assert.assertEquals("Rodrigo G", loginPage.getLoggedInUserName());
    }
}
