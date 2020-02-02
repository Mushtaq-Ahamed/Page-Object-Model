package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class RunEditLead extends ProjectSpecificMethods {
	
@Test
	
	public void runEditLead() throws InterruptedException {
		
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
		.clickEdit()
		.enterCompanyName()
		.clickUpdate();
		
	}

}
