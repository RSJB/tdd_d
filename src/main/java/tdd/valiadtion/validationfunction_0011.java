package tdd.valiadtion;

import org.testng.annotations.Test;

import tdd.drivers.driver;
import tdd.loginpge.login;

public class validationfunction_0011 extends driver{

	
	@Test
	void valid() {
		
		login lgin=new login(d);
		lgin.Username("user2");
		lgin.PAssword("123424");
		lgin.Click();
		
	}
}
