package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.LIMS.ObjectRepository.HomePage;
import com.LIMS.ObjectRepository.LoginPage;
import com.SDET43.GenricLibraries.FileUtility;
import com.SDET43.GenricLibraries.WebDriverUtility;

public class HomePage_Script {
	public static void main(String[] args) throws Throwable {
		// create objects for generic libraries

		FileUtility fLib = new FileUtility();
		WebDriverUtility wLib = new WebDriverUtility();

		// read data from property file
		String URL = fLib.ReadDataFromPropertyFIle("url");
		
		String USERNAME = fLib.ReadDataFromPropertyFIle("username");
		String PASSWORD = fLib.ReadDataFromPropertyFIle("password");

		// launch the browser
		WebDriver driver = new ChromeDriver();
		wLib.maximizeWindow(driver);
		wLib.waitForPageToLoad(driver);
		driver.get(URL);
		
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
		
		HomePage hp = new HomePage(driver);
		hp.agentModule();				//to display all Agents Information
		
		Thread.sleep(3000);
		
		hp.getPolicyBtn();				//to display all Policy Information
		
		Thread.sleep(6000);
		driver.close();
	}
}
