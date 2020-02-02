package pages;

import seleniumBase.ProjectSpecificMethods;

public class MyHomepage extends ProjectSpecificMethods {
	public MyLeadpage clickLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadpage();
	} 
	

}
