package pages;

import seleniumBase.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage enterUserName() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
		return this;
		
	}
	
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	
	public Homepage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new Homepage();
		
		
	}

}
