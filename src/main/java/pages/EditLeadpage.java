package pages;

import org.openqa.selenium.WebElement;

import seleniumBase.ProjectSpecificMethods;

public class EditLeadpage extends ProjectSpecificMethods {
	
	public EditLeadpage enterCompanyName() {
		WebElement eleSource=driver.findElementById("updateLeadForm_companyName");
		eleSource.clear();
		eleSource.sendKeys("KAISER");
		return this;
	}
	
	public EditLeadpage clickUpdate() {
		driver.findElementByName("submitButton").click();
		return this;
	}

}
