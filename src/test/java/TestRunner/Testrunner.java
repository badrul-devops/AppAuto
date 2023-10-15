package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/java/Feature",
        glue = "Stepdef",
        plugin = {"pretty", "html:target/cucumber-reports"}

)

public class Testrunner {


}
