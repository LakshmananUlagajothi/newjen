package org.defination;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefination extends BaseClass
	{
	
//		@Given("open chrome browser")
//		public void open_chrome_browser() throws IOException {
//			browseropen();
//			
//		}
    
	
		@Given("User should naviagate to the application")
		public void user_should_naviagate_to_the_application() throws IOException {
			navigateToUrl(getProperty("url"));
			
		}
	
		@Given("User click on the login link button")
		public void user_click_on_the_login_link_button() throws InterruptedException {
			clickOnElement(p.getLoginlink());
		}
	
		@Given("User enter the username as siva{int}")
		public void user_enter_the_username_as_siva(Integer int1) throws IOException {
			sendValueOnTextField(p.getEmailtextfield(), getProperty("email"));
		}
	
		@Given("User enter the passwword as Siva{int}")
		public void user_enter_the_passwword_as_Siva(Integer int1) throws IOException {
			sendValueOnTextField(p.getPasswordtextfield(),getProperty("password"));
		}
	
		@When("user click on login button")
		public void user_click_on_login_button() {
			clickOnElement(p.getLoginbutton());
			
		}
	
		@And("loginn should be success")
		public void loginn_should_be_success() {
			
			String txt=p.getVerifyAccountholdername().getText();
			Assert.assertEquals("account verified", "Hello, Lakshmanan", txt);
	}


}
