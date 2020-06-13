package com.renato.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/alugar_filme.feature",
		glue = "com.renato.steps",
		tags = {},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		strict = true)
public class RunnerTest {

}


//features = "classpath:features/checkbox")
//@CucumberOptions(features="Features/ChromeTest.feature",glue= {"src/test/java/Steps"})