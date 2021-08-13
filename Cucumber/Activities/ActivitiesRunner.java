
package CucumberTest;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"StepDefinitions"},
    tags = "@activity1_3, @@activity2_4"  
)

public class ActivitiesRunner {
	
}