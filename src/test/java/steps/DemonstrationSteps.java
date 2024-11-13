package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DemonstrationPage;

public class DemonstrationSteps {
    private WebDriver driver;
    private DemonstrationPage demonstrationPage;

    @Before
    public void iniciarDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        demonstrationPage = new DemonstrationPage(driver);
    }

    @Given("que o usuário esteja na página demo do PHPTRAVELS")
    public void queOUsuarioEstejaNaPaginaDemoDoPHPTRAVELS() {
        demonstrationPage.acessarSite();
    }

    @When("encontrar o componente de Newsletter")
    public void encontrarOComponenteDeNewsletter() {
        demonstrationPage.encontrarNewsletter();
    }

    @Then("o titulo apresentado deve ser Join Our Newsletter")
    public void oTituloApresentadoDeveSerJoinOurNewsletter() {
        demonstrationPage.validarTituloNewsletter();
    }

    @Then("o subtitulo apresentado deve ser And stay updated")
    public void oSubtituloApresentadoDeveSerAndStayUpdated() {
        demonstrationPage.validarSubTituloNewsletter();
    }

    @Then("um campo texto deve ser exibido para preenchimento do email")
    public void umCampoTextoDeveSerExibidoParaPreenchimentoDoEmail() {
        demonstrationPage.validarCampoEmailNewsletter();
    }

    @And("preencher com o email {string}")
    public void preencherComOEmail(String email) {
        demonstrationPage.preencherCampoEmailNewsletter(email);
    }

    @Then("o preenchimento do campo email {string} é validado")
    public void oPreenchimentoDoCampoEmailEValidado(String email) {
        demonstrationPage.validarPreenchimentoEmailNewsletter(email);
    }

    @Then("o usuario clica no botão Subscribe")
    public void oUsuarioClicaNoBotaoSubscribe() {
        demonstrationPage.clicarBtnSubscribe();
    }

    @After
    public void fecharDriver(){
        driver.quit();
    }
}
