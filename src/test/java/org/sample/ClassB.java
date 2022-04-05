package org.sample;

import org.baseclass.Baseclass;
import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;
import org.pojocls.Pojocls;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassB extends Baseclass {
	@BeforeClass
	public static void test6() {
		launchbrowser();
		maxmizewindow();

	}

	@Test(dataProvider = "login")
	public void test4(String user, String pass) {
		passurl("https://www.facebook.com/");
		Pojocls p = new Pojocls();
		sendkeys(p.getTxtusr(), user);
		sendkeys(p.getTxtpass(), pass);

	}

	@DataProvider(name = "login")
	public String[][] login() {

		return (String[][]) new Object[][] { { "senthu", "1234" }, { "senthu@", "1345787" }, { "abi", "2555" }, { "hARI", "32456" } };

	}

}
