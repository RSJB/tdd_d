package tdd.loginpge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver d;
	
public login(WebDriver d) {
	this.d=d;
}

public void Username(String useranme) {
	d.findElement(By.id("email")).sendKeys(useranme);
}

public void PAssword(String pw) {
	d.findElement(By.id("pass")).sendKeys(pw);
}

public void Click() {
	d.findElement(By.xpath("//*[@type='submit']")).click();}
}
