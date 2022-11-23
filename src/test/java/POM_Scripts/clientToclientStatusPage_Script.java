package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.LIMS.ObjectRepository.ClientInfoPage;
import com.LIMS.ObjectRepository.HomePage;
import com.LIMS.ObjectRepository.LoginPage;
import com.SDET43.GenricLibraries.FileUtility;
import com.SDET43.GenricLibraries.WebDriverUtility;

public class clientToclientStatusPage_Script {
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
	hp.clientModule();			//clicks on Client Module
	
	Thread.sleep(3000);
	
	ClientInfoPage cm = new ClientInfoPage(driver);
	cm.getClientStatus();		//clicks on Client Status link

	Thread.sleep(3000);
	}
}
