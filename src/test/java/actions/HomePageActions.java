package actions;

import com.beust.ah.A;
import elements.HomePageElements;
import elements.SauceLabLoginPageElements;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import steps.CommonSteps;

public class HomePageActions {


    WebDriver driver;
    HomePageElements homePageElements;

    public HomePageActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        homePageElements = new HomePageElements(driver);
    }


    public void selectProduct() {

        homePageElements.productLink.click();
    }

    public void clickOnAddTocartButton() {

        homePageElements.addToCart.click();
    }

    public void clickOnCart() {
        homePageElements.cartButton.click();
    }

    public void clickOnCheckout() {
        homePageElements.checkout.click();
    }

    public void fillTheForm(String firstName, String lastName, String zipCode) {
        homePageElements.firstName.sendKeys(firstName);
        homePageElements.lastName.sendKeys(lastName);
        homePageElements.zipCode.sendKeys(zipCode);

    }

    public void clickOnContinue() {
        homePageElements.continueButton.click();
    }

    public void clickOnFinish() {
        homePageElements.finish.click();
    }

    public void verifyOrderComplete() {

        Assert.assertEquals(homePageElements.orderCompleteMessage.getText(), "THANK YOU FOR YOUR ORDER");
    }
}
