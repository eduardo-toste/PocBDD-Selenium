package pocSelenium.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pocSelenium.utils.DriverManager;

public class ButtonsSteps {
    private WebDriver driver = DriverManager.getDriver("chrome");

    @Given("que eu estou na página principal de automação utilizada")
    public void que_eu_estou_na_página_principal_de_automação_utilizada() {
        Assert.assertEquals("https://ultimateqa.com/automation", driver.getCurrentUrl());
    }

    @Given("eu acesso novamente a opção Interactions with simple elements")
    public void eu_acesso_novamente_a_opção_interactions_with_simple_elements() {
        driver.findElement(By.linkText("Interactions with simple elements")).click();
    }

    @When("clico no botão utilizando o id")
    public void clico_no_botão_utilizando_o_id() {
        driver.findElement(By.id("idExample")).click();
    }

    @When("clico no botão utilizando o link text")
    public void clico_no_botão_utilizando_o_link_text() {
        driver.findElement(By.linkText("Click me using this link text!")).click();
    }

    @When("clico no botão utilizando o ClassName")
    public void clico_no_botão_utilizando_o_class_name() {
        driver.findElement(By.className("buttonClass")).click();
    }

    @When("clico no botão utilizando o name")
    public void clico_no_botão_utilizando_o_name() {
        driver.findElement(By.name("button1")).click();
    }

    @Then("sou redirecionado para o tela de sucesso")
    public void sou_redirecionado_para_o_tela_de_sucesso() {
        String texto = driver.findElement(By.className("entry-title")).getText();
        Assert.assertEquals("Button success", texto);
    }

    @Then("sou redirecionado para o tela de sucesso do link")
    public void sou_redirecionado_para_o_tela_de_sucesso_do_link() {
        String texto = driver.findElement(By.className("entry-title")).getText();
        Assert.assertEquals("Link success", texto);
    }
}
