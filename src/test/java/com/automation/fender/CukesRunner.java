package com.automation.fender;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(
	format={"pretty","html:target/cucumber"},
	features={"src/test/resources"}
	)

// Empty Class
public class CukesRunner {}