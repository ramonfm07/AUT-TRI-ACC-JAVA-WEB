package tricentis.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue	 = {"tricentis.steps", "tricentis.setup"},
        tags	 = {"@tag1"},
        snippets = SnippetType.UNDERSCORE
)
public class RunnerTest {


}
