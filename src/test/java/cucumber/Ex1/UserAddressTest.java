package cucumber.Ex1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/Cucumber/Features/user-address.feature",
        plugin = { "pretty", "html:report.html"}
)
public class UserAddressTest {

}