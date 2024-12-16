package pocSelenium.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pocSelenium.pages.ButtonsPage;
import pocSelenium.pages.MainPage;
import pocSelenium.utils.DriverManager;

public class ButtonsSteps {
    private WebDriver driver = DriverManager.getDriver("chrome");
    private MainPage mainPage = new MainPage(driver);
    private ButtonsPage buttonsPage = new ButtonsPage(driver);

    @Given("que eu estou na página principal de automação utilizada")
    public void que_eu_estou_na_página_principal_de_automação_utilizada() {
        Assert.assertEquals("https://ultimateqa.com/automation", driver.getCurrentUrl());
    }

    @Given("eu acesso novamente a opção Interactions with simple elements")
    public void eu_acesso_novamente_a_opção_interactions_with_simple_elements() {
        mainPage.clickInteractionsLink();
    }

    @When("clico no botão utilizando o id")
    public void clico_no_botão_utilizando_o_id() {
        buttonsPage.clickButtonById();
    }

    @When("clico no botão utilizando o link text")
    public void clico_no_botão_utilizando_o_link_text() {
        buttonsPage.clickButtonByLinkText();
    }

    @When("clico no botão utilizando o ClassName")
    public void clico_no_botão_utilizando_o_class_name() {
        buttonsPage.clickButtonByClassName();
    }

    @When("clico no botão utilizando o name")
    public void clico_no_botão_utilizando_o_name() {
        buttonsPage.clickButtonByName();
    }

    @Then("sou redirecionado para o tela de sucesso")
    public void sou_redirecionado_para_o_tela_de_sucesso() {
        String texto = buttonsPage.getSuccessMessageText();
        Assert.assertEquals("Button success", texto);
    }

    @Then("sou redirecionado para o tela de sucesso do link")
    public void sou_redirecionado_para_o_tela_de_sucesso_do_link() {
        String texto = buttonsPage.getSuccessMessageText();
        Assert.assertEquals("Link success", texto);
    }
}
