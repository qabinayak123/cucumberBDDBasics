package myTestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // features = "feature",
        //features = "feature/tagging.feature",
        features = "C:\\Users\\HP\\IdeaProjects\\cucumberProject\\feature\\hooks.feature",
        glue="stepDefinitions",
        dryRun = false,
        monochrome = true,
        strict = true,
        plugin={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"}
        //tags = {"@SanityTest,@RegressionTest"} //will execute sanity or regression tags test
)
public class TestRunner {

}
