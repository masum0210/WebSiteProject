import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/masumparvezapu/eclipse-workspace/WebSitesProject/src/openBrowser.feature"},
glue= {"RunnerPage.java"},
format= {"pretty","html:test-output", "junit:junit_xml/cucumber.xml"},
monochrome= true


		)

public class RunnerPage {

}
