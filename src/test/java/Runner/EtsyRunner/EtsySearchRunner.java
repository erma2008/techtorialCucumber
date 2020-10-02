package Runner.EtsyRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\com.cucumber.features.Etsy\\EtsySearch.feature",
        glue = "StepDefinitions\\EtsyStepDefinitions",
	    plugin = {"html:target/cucumber-html-report",
	              "json:target/cucumber.json",
	              "junit:target/cucumber.xml",
	              "rerun:target/rerun.txt"},
)
public class EtsySearchRunner {


}
