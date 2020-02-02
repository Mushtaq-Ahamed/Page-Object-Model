package pages;

import seleniumBase.ProjectSpecificMethods;

public class DuplicateLeadpage extends ProjectSpecificMethods {
	

	public ViewLeadpage clickCreateLead() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadpage();
		
	}

}
