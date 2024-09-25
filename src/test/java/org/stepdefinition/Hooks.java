package org.stepdefinition;

import org.baseclass.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
@Before
private void bef() {
	launch();
	toGetUrl("https://www.facebook.com/");
}
@After
private void aft() {
	toQuit();

}
}
