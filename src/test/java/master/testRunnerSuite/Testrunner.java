package master.testRunnerSuite;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
			features="src/test/resources",
			glue="stepDef",
			dryRun = false
			//monochrome=true
			
		)



public class Testrunner {

}
