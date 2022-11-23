package POM_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.LIMS.ObjectRepository.AddClient;
import com.LIMS.ObjectRepository.ClientInfoPage;
import com.LIMS.ObjectRepository.HomePage;
import com.LIMS.ObjectRepository.LoginPage;
import com.SDET43.GenricLibraries.ExcelUtility;
import com.SDET43.GenricLibraries.FileUtility;
import com.SDET43.GenricLibraries.JavaUtility;
import com.SDET43.GenricLibraries.WebDriverUtility;

public class AddClient_Script {
	public static void main(String[] args) throws Throwable {

		// create objects for generic libraries
		
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		JavaUtility jLib = new JavaUtility();
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
		
		ClientInfoPage cm = new ClientInfoPage(driver);
		cm.ClientPageModule();
		
//		read data from excel file
		eLib.getList("Sheet1", driver);
	
		AddClient ad = new AddClient(driver);
		ad.AddClientM(eLib.getList("Sheet1"),driver);

		Thread.sleep(3000);
		
//		File f1 = new File("./src/test/resources/Thumb.jpg");
//		String photo_path = f1.getAbsolutePath();
//		driver.findElement(By.xpath("//input[@name='fileToUpload']")).sendKeys(photo_path);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.close();
	}

}
