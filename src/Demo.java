import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium dependencies\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		// sendKeys - types text to input box
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		// click - clicks
		
		WebElement login_btn = driver.findElement(By.name("login"));
		login_btn.click();
		String expected = "Find a Flight";
		String actual = driver.getTitle();
		if(actual.contains(expected)){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
			System.out.println("Expected title: "+ expected);
			System.out.println("Actual: "+actual);
		}	
		driver.close();
	}

}
