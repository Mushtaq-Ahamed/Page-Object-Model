package pages;

import seleniumBase.ProjectSpecificMethods;

public class MyLeadpage extends ProjectSpecificMethods {
	
  public CreateLeadpage clickCreateLeadtab() {
	driver.findElementByLinkText("Create Lead").click();
	return new CreateLeadpage();
} 
	
	
	public FindLeadspage clickFindLeadstab() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadspage();
	} 
	
	public MergeLeadspage clickMergeLeadtab() {
		
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadspage();
	}
}
