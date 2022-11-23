package com.LIMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPayment {

	//Declaration
	@FindBy (name = "client_id")
	private WebElement ClientIDTB;
	
	@FindBy (name = "month")
	private WebElement MonthTB;
	
	@FindBy (name = "amount")
	private WebElement AmountTB;
	
	@FindBy (name = "due")
	private WebElement DueTB;
	
	@FindBy (name = "fine")
	private WebElement FineTB;
	
	@FindBy (xpath = "//input[@type ='submit']")
	private WebElement submitTB;
	
	//Initialization
	public AddPayment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getClientIDTB() {
		return ClientIDTB;
	}

	public WebElement getMonthTB() {
		return MonthTB;
	}

	public WebElement getAmountTB() {
		return AmountTB;
	}

	public WebElement getDueTB() {
		return DueTB;
	}

	public WebElement getFineTB() {
		return FineTB;
	}

	public WebElement getSubmitTB() {
		return submitTB;
	}
	
	//Business Libraries
	public void AddPaymentInfo(String ClientID, String Month, String Amount, String Due, String Fine)
	{
		ClientIDTB.sendKeys(ClientID);
		MonthTB.sendKeys(Month);
		AmountTB.sendKeys(Amount);
		DueTB.sendKeys(Due);
		FineTB.sendKeys(Fine);
		submitTB.click();
	}
}
