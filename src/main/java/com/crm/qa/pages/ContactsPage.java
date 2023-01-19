package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

		
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement  contactsLabel;
	
	@FindBy(name="title")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(xpath="//input[contains(text(),'submit')]")
	WebElement saveBtn;
	
	//initializing the Page Objects:
		public ContactsPage() {
			
			PageFactory.initElements(driver, this);
					
		}
	
	/*
	@FindBy(xpath="//a[contains(text(),'Amit Kare')]//parent::td//preceding-sibling::td//input[@name='contact_id']")
	WebElement contactsName ;
	*/
		
		public boolean verifyContactsLabel() {			
			return contactsLabel.isDisplayed();
		}
	
		public void selectContactsByName(String name) {
			driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]//parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
			
			
		}
	
		 public void createNewContact(String titleName, String ftname, String ltname, String comp) {
		    	Select select=new Select(driver.findElement(By.name("title")));
		    	select.selectByVisibleText(titleName);
		    	
		    	title.sendKeys(titleName);
		    	firstName.sendKeys(ftname);
		    	lastName.sendKeys(ltname);
		    	company.sendKeys(comp);
		    	saveBtn.click();
		    	
		    	
		    }
	
}
