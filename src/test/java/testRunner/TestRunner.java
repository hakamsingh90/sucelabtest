package testRunner;


import actions.HomePageActions;
import io.cucumber.java.en.And;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"features/sauceLabTest.feature"},
        glue = {"steps"},
        plugin = {"pretty", "json:target/json-report/cucumber.json","html:target/cucumber-reports.html"},
        dryRun = false,
        monochrome = true,
        tags = "@P1"

)
public class TestRunner {


}
