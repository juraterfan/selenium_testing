package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class browser_util {
	
	public static void verifyElementExist(WebDriver driver, By by) {
		try {
			Assert.assertTrue(driver.findElement(by).isDisplayed());
		}catch(NoSuchElementException e) {
			Assert.fail("Element doesn't exist");
		}
	}
}
