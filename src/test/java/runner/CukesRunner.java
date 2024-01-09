package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"html:target/html-report/cucumber-reports.html",
                "json:target/json-reports/json-report"},
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,
        tags = "",
        monochrome = true,
        publish = true
)
public class CukesRunner {

}