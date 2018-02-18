package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_Charger_Test {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_dependencies\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com/");
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void searchTest(){
		

		driver.findElement(By.id("lst-ib")).sendKeys("charger" + Keys.ENTER);
		
		String expected = "charger - Google Search";
	
		Assert.assertEquals(driver.getTitle(), expected);
		
		
	}
}
