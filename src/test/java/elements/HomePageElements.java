package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"item_4_img_link\"]/img")
    public WebElement productLink;

    @FindBy(xpath = "//button[starts-with(@id,'add-to-cart-sauce-labs')]")
    public WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    public WebElement cartButton;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    public WebElement checkout;

    @FindBy(xpath = "//*[@id=\"first-name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last-name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id=\"postal-code\"]")
    public WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"finish\"]")
    public WebElement finish;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    public WebElement orderCompleteMessage;

    public HomePageElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
