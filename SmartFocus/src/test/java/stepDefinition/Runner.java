package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty", "html:target/cucumber-html-report"},
features="src/test/resources", tags = "@Signup")
public class Runner {

}
