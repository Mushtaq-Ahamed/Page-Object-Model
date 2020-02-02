package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import seleniumBase.ProjectSpecificMethods;

public class FindLeadspage extends ProjectSpecificMethods {
	
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	
	Set<String> allWindows2 = driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	
	
	public FindLeadspage enterFirstName() {
		
		
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Tim");
		return this;
	}
	
public FindLeadspage enterFirstName1() {
		
		
		driver.findElementByXPath("//input[@name='firstName']").sendKeys("Mushtaq");
		return this;
	}
	
	public FindLeadspage clickFindLeads() {
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	
	public ViewLeadpage clickFirstelement() throws InterruptedException {
		Thread.sleep(2000);
		String leadid = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		System.out.println("FirstResultingelement : " + leadid); 
		
		return new ViewLeadpage();
	}
	
	public MergeLeadspage clickFirstelement1() throws InterruptedException {
		Thread.sleep(2000);
		String leadid = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		System.out.println("FirstResultingelement : " + leadid); 
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadspage();
	}
	
	public MergeLeadspage clickFirstelement2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.switchTo().window(allhandles2.get(0));
		return new MergeLeadspage();
	}
	
	
	

	
}
