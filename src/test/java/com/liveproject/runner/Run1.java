package com.liveproject.runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"classpath:FeatureFiles/Login2.feature" },
		glue={"classpath:com.liveproject.stepdef"},
		dryRun = false,
		monochrome = true,
		plugin={"html:target/cucumber_html_report"}
		)
public class Run1 {

}
