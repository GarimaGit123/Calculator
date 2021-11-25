package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome = true
//plugin ={"pretty","junit:target/JunitReports/report.xml",
//"json:tasrget/JSONReports/report.json",
//"html:target/HtmlReports"
//tags="@smokeTest"

//plugin ={"pretty","json:tasrget/JSONReports/report.json"}
//plugin ={"pretty","html:target/HtmlReports"}
	)
public class TestRunner {

}
