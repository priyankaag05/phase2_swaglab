package stepdefsphase2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome= true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features= "src/test/java/features",
		glue = "stepdefsphase2",
		//tags={"@sanity"}// for one scenario
		tags= {"@sanity or @regression"} //for multiple scenario
		)
public class TestRunner {

}