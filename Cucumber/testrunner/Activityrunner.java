package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\saikrishnaAchanta\\IdeaProjects\\9Nov24Selenium\\src\\test\\java\\features",
        glue = {"stepdefinitions"},
        plugin = { "pretty" ,"html:target/cucumber-output/cucumber-report.html"},
        tags="@activity5"
)

public class Activityrunner {
    //empty
}