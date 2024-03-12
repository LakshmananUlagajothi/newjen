package org.elements;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass {
	
     public PojoClass() {
		
		PageFactory.initElements(driver,this);	
	}

	@FindBy(xpath = "//button[.='Login']")
	private WebElement loginlink;
	
	@FindBy(id = "Email")
	private WebElement emailtextfield;
	
	@FindBy(id = "Password")
	private WebElement passwordtextfield;
	
	@FindBy(id = "Login")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//a[@id='cart']/../h3")
	private WebElement verifyAccountholdername;

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getVerifyAccountholdername() {
		return verifyAccountholdername;
	}


}
