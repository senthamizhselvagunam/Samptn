package org.sample;

import org.baseclass.Baseclass;
import org.pojocls.Pojocls;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassC  extends Baseclass{
	
	@Parameters({"Emailadd","Password"})
	@Test
	private void test7(String user,String pass) {
		Pojocls p=new Pojocls();
		sendkeys(p.getTxtusr(), user);
		sendkeys(p.getTxtpass(),pass);

	}
	@Test
	 private void tc() {
		launchbrowser();
		passurl("https://www.facebook.com/");
		maxmizewindow();

	}
	//@Ignore
	@Test
	public void test9() {
		System.out.println("test9");

	}



}
