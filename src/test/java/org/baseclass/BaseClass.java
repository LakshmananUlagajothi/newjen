package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.Set;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.elements.PojoClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	public static WebDriver driver;
	public static PojoClass p ;
	public static Actions action;
	public static WebDriverWait wait;
	public static final String commanDataPath="./src/test/resources/commondata.properties";

	public static void browseropen() {
			driver=new ChromeDriver();
			p=new PojoClass();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public static void txtBox(WebElement element,String s) {
		element.sendKeys(s);
		
	}
	
	
	public static void browsercl() {
		driver.quit();
	}
	
	public static void navigateToUrl(String url) {
		driver.get(url);
		
	}
	
	public static void maxWin() {
		driver.manage().window().maximize();
	}
	
	
	public static String getProperty(String key) throws IOException
	{
		FileInputStream file=new FileInputStream(commanDataPath);
		
		Properties p=new Properties();
		p.load(file);
		String property=p.getProperty(key);
		
		return property;
		
	}
	public static void webDriverWait(WebElement element) {
		 wait= new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
//	public static void webelementClick(WebElement element) {
//		element.click();
//		 
//	}
	
//	public static void emailTextFeild(String email) {
//		 p.getEmailtextfield().sendKeys(email);
//	}
//	
//	public static void passwordTextFeild(String password) {
//		 p.getPasswordtextfield().sendKeys(password);
//	}
	
//	public static void clickOnLoginButton() {
//		p.getLoginbutton().click();
//	}

//	public static void softAssertString() {
//		Assert.
//	}
	
	public static String getSystemDate()
	{
        String date = LocalDateTime.now().toString();
		date=date.toString().replace(":","_").replace("-","_");
		return date;
		
	}


	public static void scrollByAmount(int x,int y)
		{
			 action=new Actions(driver);
			action.scrollByAmount(x, y).perform();			
		}
		
	public static void scrollToTheElement(WebElement element)
		{
			 action=new Actions(driver);
			 action.scrollToElement(element).perform();
		}
		
		
		/**
		 * This method is used to click  on given element
		 */
	public static void clickOnElement(WebElement element) {
			element.click();
		}
		
		/**
		 * This Methodisisused to enter valuetoelement like text field
		 * @param element
		 * @param value
		 */
	public static void sendValueOnTextField(WebElement element,String value) {
			element.sendKeys(value);
		}
		
	public static void selectOptionByIndex(WebElement element, int index) {
			Select select=new Select(element);
			select.selectByIndex(index);
		}

	public static void selectOptionByValue(WebElement element, String value) {
			Select select=new Select(element);
			select.selectByValue(value);
		}
		
	public static void selectOptionByVisibleText(WebElement element, String text) {
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}
	
	public static String readFromExcel() throws IOException {
		
		File f=new File("./src/test/resources/Book1.xlsx");
		FileInputStream file=new FileInputStream(f);
		XSSFWorkbook book=new XSSFWorkbook(file);
		Sheet s= book.getSheet("Sheet1");
		return s.getRow(0).getCell(0).toString();
	}
		
	public static void switchToWindowByTitle(String title) {
			Set<String> childWindows = driver.getWindowHandles();
			
			for (String child : childWindows) {
				driver.switchTo().window(child);
				
				if(driver.getTitle().contains(title)) {
					break;
				}
			}
		}
		
		
		
	public static void switchToWindowByURL(String URL) {
			Set<String> childWindows = driver.getWindowHandles();
			
			for (String child : childWindows) {
				driver.switchTo().window(child);
				
				if(driver.getCurrentUrl().contains(URL)) {
					break;
				}
			}
		}
	public static void webpageScreenShot() {
		
		
	}
		
//	public static String getScreenShotOfWebpage()
//		{
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			File temp=ts.getScreenshotAs(OutputType.FILE);
//			String imagepath="./ScreenShot"+".png";
//			File perm=new File(imagepath);
//			try 
//			{
//				FileHandler.copy(temp, perm);
//			}
//			catch (Exception e) {
//				e.printStackTrace();
//			}
//			return "."+imagepath;
//			
//		}
//	public static String getScreenShotOfWebElement(WebElement element)
//		{
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			File temp=ts.getScreenshotAs(OutputType.FILE);
//			String imagepath="./ScreenShot"+".png";
//			File perm=new File(imagepath);
//			try 
//			{
//				FileHandler.copy(temp, perm);
//			}
//			catch (IOException e) {
//				e.printStackTrace();
//			}
//			return "."+imagepath;
//			
//		}
	

}