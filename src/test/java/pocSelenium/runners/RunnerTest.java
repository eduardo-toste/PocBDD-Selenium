package pocSelenium.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        glue = {"pocSelenium.steps", "pocSelenium.hooks"},
        tags = "not @ignore",
        dryRun = false,
        plugin = {"pretty", "html:target/reports/report-html/report.html", "json:target/reports/report-json/report.json"})
public class RunnerTest {
}
