package ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumbertask-reports.html",
                "json:target/json-reports/cucumbertask.json",
                "junit:target/xml-report/cucumbertask.xml"},
        features="src/test/resources/uiFeature/Login.feature",
        glue="ui/stepdefinitions",
        tags="@all"  ,

        dryRun= false
)

public class Runner {

}