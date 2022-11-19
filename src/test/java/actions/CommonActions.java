package actions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import steps.CommonSteps;

public class CommonActions {

    WebDriver driver;
    CommonSteps commonSteps;


    public CommonActions(CommonSteps commonSteps){
        this.driver = commonSteps.getDriver();
    }

    public void openUrl(String Url){
        driver.get(Url);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

    public String getCurrentPageTitle(){
        return driver.getTitle();
    }


    public void waitfor(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
