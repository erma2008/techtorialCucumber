package Runner.WebOrderRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\com.cucumber.features\\WebOrderLogin.feature",
        glue = "StepDefinitions",
        dryRun = false,
        monochrome = false,
        plugin = {"html:target/cucumber-html-report",
                  "json:target/cucumber.json",
                  "junit:target/cucumber.xml",
                  "rerun:target/rerun.txt"},

)
public class cukesRunner {
}
