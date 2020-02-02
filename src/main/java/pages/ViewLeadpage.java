package pages;

import seleniumBase.ProjectSpecificMethods;

public class ViewLeadpage extends ProjectSpecificMethods {
	
public MyLeadpage clickDelete() {
		
		driver.findElementByLinkText("Delete").click();
		return new MyLeadpage();
	}
	
	public ViewLeadpage verifyFirstName() {
	
	String name = driver.findElementById("viewLead_firstName_sp").getText();
	System.out.println("Name :" +name+ " is Available");
    return this;
	
	}  
	
	public EditLeadpage clickEdit() {
		
		driver.findElementByLinkText("Edit").click();
		return new EditLeadpage();
	}
	
	public DuplicateLeadpage clickDuplicateLead() {
		
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadpage();
	}
	
	public FindLeadspage clickFindLeadstab() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadspage();
	} 
	
	
	
}
