package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.BrowserUtils;

public class FileUpload_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium dependencies\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		WebElement file_upload = driver.findElement(By.xpath("//input[@id='file-upload']"));
		file_upload.sendKeys("C:\\Users\\JURAT\\Desktop\\s-l1600 (3).jpg");
		driver.findElement(By.xpath("//input[@class='button']")).click();;

	}

}
