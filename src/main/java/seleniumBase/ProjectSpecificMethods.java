package seleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import utils.ReadExcel;

public class ProjectSpecificMethods {

	public static ChromeDriver driver;
	//public String excelFileName="TC001_CreateLead";
	
	//@Parameters({"url","username","password"})
	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void closeBrowser() {
		//driver.close();
	}

/*	 @DataProvider
	 public String[][] sendData() throws IOException {
			String[][] data = ReadExcel.readExcel();
			return data;
	 }	*/
	/*   public String[][] sendData() {
		String[][] data = new String[1][3];
		
		data[0][0] = "TestLeaf"; 
		data[0][1] = "Sam";
		data[0][2] = "Lazarus";
		
	/*	data[1][0] = "Microsoft";
		data[1][1] = "Naveen";
		data[1][2] = "Elumalai";  */
		
		//return data; 
	 
	
}