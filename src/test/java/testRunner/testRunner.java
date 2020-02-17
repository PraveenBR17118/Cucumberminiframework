package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/praveen/Documents/IntelliJidea/Cucumber/SeleniumCucumber/Features/OrangeHRM.feature",
        glue = "stepDefinitions",
        dryRun = false , // Cross check every feature file step is contains a correspondence step data or not
        monochrome = true ,
        plugin = {"pretty" , "html:test-output"},
        tags = {"@sanity"}
)
public class testRunner
{

}
//dkjkds