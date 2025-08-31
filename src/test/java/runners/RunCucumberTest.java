package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",   // path to feature files
        glue = {"stepDefinitions"},                 // package for step defs
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",  // HTML report
                "json:target/cucumber-report.json",  // JSON report
                "junit:target/cucumber-report.xml"   // JUnit XML report
        },
        monochrome = true
)
public class RunCucumberTest {
}
