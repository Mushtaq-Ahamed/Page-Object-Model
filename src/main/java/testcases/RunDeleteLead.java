package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class RunDeleteLead extends ProjectSpecificMethods {
	
	@Test
	
	public void runDeleteLead() throws InterruptedException {
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeadstab()
		.enterFirstName()
		.clickFindLeads()
		.clickFirstelement()
		.clickDelete();
		
	}
	

}
