package org.testrunner;

import org.baseclass.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse\\CucumberClass\\src\\test\\resources\\Feature\\login.feature",glue="org.stepdefinition",dryRun=false,monochrome=true)
public class TestRunner {

	
	
	
	
}
