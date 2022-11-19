package actions;

import elements.SauceLabLoginPageElements;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class SauceLabLoginPageActions {

    WebDriver driver;
    SauceLabLoginPageElements sauceLabLoginPageElements;


    public SauceLabLoginPageActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        sauceLabLoginPageElements = new SauceLabLoginPageElements(driver);
    }
    public void enterUsername(String usernameText) {
        sauceLabLoginPageElements.username.sendKeys(usernameText);
    }

    public void enterPassword(String passwordText) {
        sauceLabLoginPageElements.password.sendKeys(passwordText);
    }

    public void clickOnLogin() {
        sauceLabLoginPageElements.loginButton.click();
    }


}
