package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemonstrationElements {
    //Newsletter
    @FindBy (xpath = "//h3[@class='text-light m-0']")
    public static WebElement tituloNewsletter;

    @FindBy (xpath = "//p[@class='text-light m-0']")
    public static WebElement subTituloNewsletter;

    @FindBy (xpath = "//input[@id='address']")
    public static WebElement campoEmailNewsletter;

    @FindBy (xpath = "//button[@id='subBtn']")
    public static WebElement btnSubscribeNewsletter;

    //Menus e Hamburguer
    @FindBy (xpath = "//button[@class='navbar-toggler p-3 border-0']")
    public static WebElement menuHamburguer;

    @FindBy (xpath = "//a[@href='https://app.phptravels.com/signup']")
    public static WebElement btnSignUp;

    @FindBy (xpath = "//a[@href='https://app.phptravels.com/login']")
    public static WebElement btnLogin;

    @FindBy (xpath = "//a[@href='https://calendly.com/phptravels']")
    public static WebElement btnTalkToSales;


}