package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src\\test\\java\\feature\\Login.feature",
		glue = {"steps", "hooks"},
		dryRun= false,
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin= {"pretty",
				"html:cucumberReports"})
public class Runner extends AbstractTestNGCucumberTests{}
