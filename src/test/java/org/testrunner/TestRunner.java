package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"}, glue= {"org.stepref"},dryRun=false,
monochrome=true,plugin= {"pretty","html:D:\\Users\\gnanas\\eclipse-workspace\\FirstCucumberProject\\target",
"json:D:\\\\Users\\\\gnanas\\\\eclipse-workspace\\\\FirstCucumberProject\\\\target\\Report.json"})
public class TestRunner {

}
