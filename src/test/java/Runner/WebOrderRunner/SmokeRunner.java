package Runner.WebOrderRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\",
        glue = "StepDefinitions",
        monochrome = true,
        dryRun = false,
        tags = "@smoke",
        plugin = {"html:target/cucumber-html-report",
                  "json:target/cucumber.json",
                  "junit:target/cucumber.xml",
                  "rerun:target/rerun.txt"},
)
public class SmokeRunner {
}
