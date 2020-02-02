package pages;

import seleniumBase.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods {
	
	public MyHomepage clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomepage();
	}

}
