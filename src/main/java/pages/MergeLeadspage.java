package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import seleniumBase.ProjectSpecificMethods;

public class MergeLeadspage extends ProjectSpecificMethods {
	
	
	
	public FindLeadspage clickonimage1() {
		
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadspage();
	}
	
public FindLeadspage clickonimage2() {
		
	    driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
	    Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		return new FindLeadspage();
	}

public ViewLeadpage clickMergeButton() throws InterruptedException {
	
	driver.findElementByXPath("//a[text()='Merge']").click();
	driver.switchTo().alert().accept();
	return new ViewLeadpage();
}


}

