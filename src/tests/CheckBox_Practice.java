package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.BrowserUtils;

public class CheckBox_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium dependencies\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement one = driver.findElement(By.xpath("//FORM[contains(@id, \"checkboxes\")]/input[2]"));
		BrowserUtils.checkBoxSelected(one);
	}

}
