	package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features="feature",glue= {"Stepdefination","Utiity"
		},plugin= {"html:target/cucumber-html-report"},tags="@Test")










public class TestRunner {

}
