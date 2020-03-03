package Runner.WebOrderRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\com.cucumber.features\\WebOrderViewAllOrders.feature",
        glue = "StepDefinitions",

       monochrome = true
       // dryRun = true //gives only unimplemented steps
)
public class AllordersRunner {


}
