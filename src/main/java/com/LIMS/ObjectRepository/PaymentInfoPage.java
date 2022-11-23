package com.LIMS.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInfoPage {

	//Declaration
	@FindBy (xpath = "//a[text()='Add Payment']")
	private WebElement addPaymentBtn;
	
	//Initialization
	public PaymentInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getAddPaymentBtn() {
		return addPaymentBtn;
	}
	
	//Business Libraries
		public void PaymentInformation()
		{
			addPaymentBtn.click();
		}
}
