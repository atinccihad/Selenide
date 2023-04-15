package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"stepdefinitions"},
        dryRun = false,
        tags = "@iframe" // iki veya daha fazla tagi calistirmak isterseniz "@tagname1  or  @tagname2 or ....."

)
public class Runners {

}
