package pages;

import seleniumBase.ProjectSpecificMethods;

public class CreateLeadpage extends ProjectSpecificMethods {
	
	public CreateLeadpage enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	
	public CreateLeadpage enterFirstName(String fNmae) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fNmae);
		return this;
	}
	
	public CreateLeadpage enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public ViewLeadpage clickCreateLead() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadpage();
	}

}
