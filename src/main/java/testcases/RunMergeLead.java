package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class RunMergeLead extends ProjectSpecificMethods {
	
@Test
	
	public void runMergeLead() throws InterruptedException {
		
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeadtab()
		.clickonimage1()
		.enterFirstName()
		.clickFindLeads()
		.clickFirstelement1()
		.clickonimage2()
		.enterFirstName1()
		.clickFindLeads()
		.clickFirstelement2()
		.clickMergeButton()
		.clickFindLeadstab();
		
	}

}
