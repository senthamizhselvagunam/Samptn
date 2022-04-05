package org.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class A {
	@DataProvider(name="fb")
	public String[][] Main() {
		return new String[][] {
			{"hari","12344"},
			{"abi","45657"},
			{"ram","97638"},
			{"kumar","0986"}
			
		};
	
	
}}