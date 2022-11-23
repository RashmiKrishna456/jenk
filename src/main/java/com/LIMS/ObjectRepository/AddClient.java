package com.LIMS.ObjectRepository;

import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient{
	//Declaration
	@FindBy (name = "client_password")
	private WebElement clientPasswordTB;
	
	@FindBy (name = "name")
	private WebElement clientNameTB;
	
	@FindBy(name = "sex")
	private WebElement clientGenderTB;
	
	@FindBy(name = "birth_date")
	private WebElement clientBirthDateTB;
	
	@FindBy(name = "maritial_status")
	private WebElement clientMaritalStatusTB;
	
	@FindBy(name = "nid")
	private WebElement clientNidTB;
	
	@FindBy(name = "phone")
	private WebElement clientPhoneTB;
	
	@FindBy(name = "address")
	private WebElement clientAddressTB;
	
	@FindBy(name = "policy_id")
	private WebElement clientPolicyIDTB;
	
	@FindBy(name = "nominee_name")
	private WebElement nomineeNameTB;
	
	@FindBy(name = "nominee_sex")
	private WebElement nomineeGenderTB;
	
	@FindBy(name = "nominee_birth_date")
	private WebElement nomineeBirthDateTB;
	
	@FindBy(name = "nominee_nid")
	private WebElement nomineeNidTB;
	
	@FindBy(name = "nominee_relationship")
	private WebElement nomineeRelationshipTB;
	
	@FindBy(name = "priority")
	private WebElement priorityTB;
	
	@FindBy(name = "nominee_phone")
	private WebElement nomineePhoneTB;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitBtn;
	
	//Initialization
	public AddClient(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getClientPasswordTB() 
	{
		return clientPasswordTB;
	}
	public WebElement getClientNameTB() 
	{
		return clientNameTB;
	}
	public WebElement getClientGenderTB() 
	{
		return clientGenderTB;
	}
	public WebElement getClientBirthDateTB() 
	{
		return clientBirthDateTB;
	}
	public WebElement getClientMaritalStatusTB() 
	{
		return clientMaritalStatusTB;
	}
	public WebElement getClientNidTB() 
	{
		return clientNidTB;
	}
	public WebElement getClientPhoneTB() 
	{
		return clientPhoneTB;
	}
	public WebElement getClientAddressTB() 
	{
		return clientAddressTB;
	}
	public WebElement getClientPolicyIDTB() 
	{
		return clientPolicyIDTB;
	}
	public WebElement getNomineeNameTB() 
	{
		return nomineeNameTB;
	}
	public WebElement getNomineeGenderTB() 
	{
		return nomineeGenderTB;
	}
	public WebElement getNomineeBirthDateTB() 
	{
		return nomineeBirthDateTB;
	}
	public WebElement getNomineeNidTB() 
	{
		return nomineeNidTB;
	}
	public WebElement getNomineeRelationshipTB() 
	{
		return nomineeRelationshipTB;
	}
	public WebElement getPriorityTB() 
	{
		return priorityTB;
	}
	public WebElement getNomineePhoneTB() 
	{
		return nomineePhoneTB;
	}
	public WebElement getSubmitBtn() 
	{
		return submitBtn;
	}
	
	//Business Libraries
	
	public void AddClientM(Map<String, String>map, WebDriver driver)
	{
		for(Entry<String, String> set : map.entrySet())
		{
			driver.findElement(By.name(set.getKey())).sendKeys(set.getValue());
		}
	}
	public void AddClientModule(String ClientPassword, String ClientName, String ClientGender,
			String ClientDob, String MaritalStatus, String ClientNid, String ClientPhone, String ClientAddress,
			String Policyid, String NomineeName, String NomineeGender, String NomineeDob,
			String Nomineeid, String Relationship, String Priority, String NomineePhone )
	{
		clientPasswordTB.sendKeys(ClientPassword);
		clientNameTB.sendKeys(ClientName);
		clientGenderTB.sendKeys(ClientGender);
		clientBirthDateTB.sendKeys(ClientDob);
		clientMaritalStatusTB.sendKeys(MaritalStatus);
		clientNidTB.sendKeys(ClientNid);
		clientPhoneTB.sendKeys(ClientPhone);
		clientAddressTB.sendKeys(ClientAddress);
		clientPolicyIDTB.sendKeys(Policyid);
		
		nomineeNameTB.sendKeys(NomineeName);
		nomineeGenderTB.sendKeys(NomineeGender);
		nomineeBirthDateTB.sendKeys(NomineeDob);
		nomineeNidTB.sendKeys(Nomineeid);
		nomineeRelationshipTB.sendKeys(Relationship);
		priorityTB.sendKeys(Priority);
		nomineePhoneTB.sendKeys(NomineePhone);
		submitBtn.click();
	}
}
