package tdd.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class driver {
	public 	WebDriver d;

	@BeforeMethod
	public void initiatevieDriver() {
	
		d= new ChromeDriver();
		
		d.get("https://www.facebook.com/");

	}
	
	
//	@AfterMethod
	public void closedriver() {
		d.close();

	}

}
