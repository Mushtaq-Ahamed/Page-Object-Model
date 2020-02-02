package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumBase.ProjectSpecificMethods;

public class RunCreateLead extends ProjectSpecificMethods {
	@Test(dataProvider = "sendData")
	public void runCreateLead(String cName,String fName, String lName) {
		new LoginPage()
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadtab()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead()
		.verifyFirstName();
		
		
		
	}

}
