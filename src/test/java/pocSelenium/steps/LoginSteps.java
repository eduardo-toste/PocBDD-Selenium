package pocSelenium.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pocSelenium.utils.DriverManager;
import pocSelenium.utils.Delay;

public class LoginSteps {
    Delay delay = new Delay();
    private WebDriver driver = DriverManager.getDriver("chrome");

    @Given("que eu estou na página principal de automação")
    public void que_eu_estou_na_página_principal_de_automação() {
        Assert.assertEquals("https://ultimateqa.com/automation", driver.getCurrentUrl());
    }

    @Given("eu acesso a opção Interactions with simple elements")
    public void eu_acesso_a_opção_interactions_with_simple_elements() {
        driver.findElement(By.linkText("Interactions with simple elements")).click();
    }

    @When("eu clico na opção Go to login page")
    public void eu_clico_na_opção_go_to_login_page() {
        delay.delay(500);
        driver.findElement(By.linkText("Go to login page")).click();
    }

    @Then("sou redirecionado para a página de login")
    public void sou_redirecionado_para_a_página_de_login() {
        String texto = driver.findElement(By.className("page__heading")).getText();
        Assert.assertEquals("Welcome Back!", texto);
    }

    @When("clico em Sign in")
    public void clico_em_sign_in() {
        driver.findElement(By.xpath("//button[@data-sitekey='6LdnNvYpAAAAAO9SKKhiP8DgM1q2glG4mI3iyjzP']")).click();
    }

    @When("clico no campo de e-mail")
    public void clico_no_campo_de_e_mail() {
        driver.findElement(By.id("user[email]")).click();
    }

    @When("clico no campo senha e clico fora do campo")
    public void clico_no_campo_senha_e_clico_fora_do_campo() {
        driver.findElement(By.id("user[password]")).click();
        driver.findElement(By.id("user[email]")).click();
    }

    @Then("é apresentado um erro para cada campo")
    public void é_apresentado_um_erro_para_cada_campo() {
        String textoEmail = driver.findElement(By.id("user[email]-error")).getText();
        String textoSenha = driver.findElement(By.id("user[password]-error")).getText();
        Assert.assertEquals("Please enter a valid email address", textoEmail);
        Assert.assertEquals("This field cannot be blank", textoSenha);
    }

    @Then("o login é recusado e apresenta o erro")
    public void o_login_é_recusado_e_apresenta_o_erro() {
        delay.delay(2000);
        String textoInvalido = driver.findElement(By.xpath("//li[@class='form-error__list-item']")).getText();
        Assert.assertEquals("Invalid email or password.", textoInvalido);
    }

    @When("insiro um e-mail e senha incorretos")
    public void insiro_um_e_mail_e_senha_incorretos() {
        driver.findElement(By.id("user[email]")).sendKeys("a@a.com");
        driver.findElement(By.id("user[password]")).sendKeys("aaaa");
    }

    @When("insiro um e-mail e senha corretos")
    public void insiro_um_e_mail_e_senha_corretos() {
        driver.findElement(By.id("user[email]")).sendKeys("rodrigogarro10@gmail.com");
        driver.findElement(By.id("user[password]")).sendKeys("rgarro10");
    }

    @Then("o login é aceito")
    public void o_login_é_aceito() {
        delay.delay(500);
        String texto = driver.findElement(By.xpath("//button[normalize-space()='Rodrigo G']")).getText();
        Assert.assertEquals("Rodrigo G", texto);
    }
}
