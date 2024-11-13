package pages;

import elements.DemonstrationElements;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemonstrationPage extends DemonstrationElements {
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;


    public DemonstrationPage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void acessarSite() {
        driver.get("https://phptravels.com/demo");
    }

    public void encontrarNewsletter() {
        action.moveToElement(tituloNewsletter);
    }

    public void validarTituloNewsletter() {
        Assertions.assertEquals("Join Our Newsletter", tituloNewsletter.getText());
    }

    public void validarSubTituloNewsletter() {
        Assertions.assertEquals("And stay updated", subTituloNewsletter.getText());
    }

    public void validarCampoEmailNewsletter() {
        Assertions.assertTrue(campoEmailNewsletter.isDisplayed());
    }

    public void preencherCampoEmailNewsletter(String email) {
        campoEmailNewsletter.sendKeys(email);
    }

    public void validarPreenchimentoEmailNewsletter(String email) {
        String valorEmail = campoEmailNewsletter.getAttribute("value");
        if (campoEmailNewsletter.isDisplayed()) {
            Assertions.assertEquals(valorEmail, email);
            //System.out.println("Email Okay");
        } else {
            //System.out.println("Email NOT Okay");
        }
    }

    public void clicarBtnSubscribe(){
        action.moveToElement(btnSubscribeNewsletter).click().perform();
    }
}
