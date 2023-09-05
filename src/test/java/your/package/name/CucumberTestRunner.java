import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "your.package.name", // Replace with the package where your step definitions are located
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class CucumberTestRunner {
}
