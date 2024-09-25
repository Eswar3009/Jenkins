package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse\\CucumberClass\\AllReports\\Failed\\failed.txt",glue="org.stepdefinition")
public class TestReRunner {

}
