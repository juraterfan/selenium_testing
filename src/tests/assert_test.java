package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.browser_util;


public class assert_test {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium dependencies\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/login.aspx");
	}
	@Test
	public void test() {
		
		

         browser_util.verifyElementExist(driver,By.id("ctl00_MainContent_username"));
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		try {
			Assert.assertTrue(driver.findElement(By.id("ctl00_MainContent_login_button")).isDisplayed());
		}catch (Exception e){
			System.out.println("In exception fault now");
			Assert.fail();
		}
	}
	

}
