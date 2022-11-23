package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.LIMS.ObjectRepository.AddNominee;
import com.LIMS.ObjectRepository.HomePage;
import com.LIMS.ObjectRepository.LoginPage;
import com.LIMS.ObjectRepository.NomineeInfoPage;
import com.SDET43.GenricLibraries.ExcelUtility;
import com.SDET43.GenricLibraries.FileUtility;
import com.SDET43.GenricLibraries.JavaUtility;
import com.SDET43.GenricLibraries.WebDriverUtility;

public class AddNominee_Script {

	public static void main(String[] args) throws Throwable {

//		 create objects for generic libraries
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();

//		 read data from property file
		String BROWSER = fLib.ReadDataFromPropertyFIle("browser");
		String URL = fLib.ReadDataFromPropertyFIle("url");
		String USERNAME = fLib.ReadDataFromPropertyFIle("username");
		String PASSWORD = fLib.ReadDataFromPropertyFIle("password");

//		 launch the browser
		WebDriver driver = null;
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browser");
		}
		wLib.maximizeWindow(driver);
		wLib.waitForPageToLoad(driver);
		driver.get(URL);

		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);
		
		HomePage hp = new HomePage(driver);
		hp.nomineeModule();
	
		NomineeInfoPage ni = new NomineeInfoPage(driver);
		ni.NomineeInformation();
		Thread.sleep(2000);
		
		eLib.getList("Sheet3");
		AddNominee an = new AddNominee(driver);
		Thread.sleep(3000);
		
		an.addNomineePage(eLib.getList("Sheet3"),driver);
//		an.clickonSubmitBtn();
		
	}
}
