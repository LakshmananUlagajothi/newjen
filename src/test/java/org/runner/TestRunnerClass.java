package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",glue = "org.defination",
dryRun = false,snippets = SnippetType.CAMELCASE,plugin = {"pretty","html:target",
		"json:reports/result.json","junit:reports/result.xml"})

public class TestRunnerClass {

	
	
}
