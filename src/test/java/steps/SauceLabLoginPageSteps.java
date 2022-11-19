package steps;

import actions.CommonActions;
import actions.ConfigFileReader;
import actions.HomePageActions;
import actions.SauceLabLoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SauceLabLoginPageSteps {


    SauceLabLoginPageActions sauceLabLoginPageActions;
    HomePageActions homePageActions;
    CommonActions commonActions;
    ConfigFileReader configFileReader;

    public SauceLabLoginPageSteps(CommonActions commonActions, SauceLabLoginPageActions sauceLabLoginPageActions,
                                  HomePageActions homePageActions, ConfigFileReader configFileReader) {
        this.commonActions = commonActions;
        this.sauceLabLoginPageActions = sauceLabLoginPageActions;
        this.homePageActions = homePageActions;
        this.configFileReader = configFileReader;
    }

    @Given("Open the saucelab page")
    public void open_the_saucelab_page() {
        commonActions.openUrl(configFileReader.getApplicationUrl());


    }

    @When("user enters the  username as {string}")
    public void user_enters_the_username_as(String string) {
        sauceLabLoginPageActions.enterUsername(string);

    }

    @When("user enters the password as {string}")
    public void user_enters_the_password_as(String string) {
        sauceLabLoginPageActions.enterPassword(string);

    }

    @When("click on login button")
    public void click_on_login_button() {
        sauceLabLoginPageActions.clickOnLogin();

    }

    @Then("user able to login and verify the home page")
    public void user_able_to_login_and_verify_the_home_page() {
        Assert.assertEquals(commonActions.getCurrentPageTitle(), "Swag Labs");

    }


    @Then("select a product from given list")
    public void select_a_product_from_given_list() {
        commonActions.waitfor();
        homePageActions.selectProduct();
    }

    @Then("user add product to the cart")
    public void user_add_product_to_the_cart() {
        commonActions.waitfor();
        homePageActions.clickOnAddTocartButton();
    }

    @Then("user click on cart icon")
    public void user_click_on_cart_icon() {
        commonActions.waitfor();
        homePageActions.clickOnCart();
    }

    @Then("user click on checkout button")
    public void user_click_on_checkout_button() {
        homePageActions.clickOnCheckout();
    }

    @Then("user enter firstname lastname and zipcode")
    public void user_enter_firstname_lastname_and_zipcode() {
        homePageActions.fillTheForm(configFileReader.getFirstName(), configFileReader.getLastName(), configFileReader.getZipCode());

    }

    @Then("click on continue button")
    public void click_on_continue_button() {
        commonActions.waitfor();
        homePageActions.clickOnContinue();

    }

    @Then("user click on finish and check order complete")
    public void user_click_on_finish_and_check_order_complete() {
        commonActions.waitfor();
        homePageActions.clickOnFinish();
        homePageActions.verifyOrderComplete();
    }


}
