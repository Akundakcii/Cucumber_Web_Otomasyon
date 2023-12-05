package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/Actions.feature"},glue = {"StepsDefination"})

public class TestNGRunner extends AbstractTestNGCucumberTests {

}
