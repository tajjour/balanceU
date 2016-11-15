package com.harvard.group3.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by tajjour on 2016-11-13.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","json:target/"},
        features = {"src/main/java/com/harvard/group3/cucumber"}
)
public class CucumberRunner {
}
