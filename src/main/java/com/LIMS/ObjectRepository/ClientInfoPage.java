package com.LIMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientInfoPage
{
	//Declaration
	@FindBy (linkText = "Add Client")
	private WebElement addClientBtn;

	@FindBy (xpath = "(//a[text()='Client Status'])[1]")
	private WebElement clientStatus;

	//Initialization
	public ClientInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getAddClientBtn() 
	{
		return addClientBtn;
	}
	public WebElement getClientStatus() {
		return clientStatus;
	}

	//Business Libraries
	
	public void ClientPageModule()
	{
		addClientBtn.click();
	}
	
	public void clientStatusLnk()
	{
		clientStatus.click();
	}
}


