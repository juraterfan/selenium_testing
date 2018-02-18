package drop_down;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_test {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium dependencies\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.healthcare.gov/");
	    
		WebElement drop_down = driver.findElement(By.name("q_23536"));

		Select list = new Select(drop_down);
		
		List<WebElement> drop_down_options = list.getOptions();
		System.out.println(list.getFirstSelectedOption().getText());
		
        System.out.println(drop_down_options.size());

    
        
        //for loop
      for(int i=0; i < drop_down_options.size(); i++) {
        	
        	System.out.println(drop_down_options.get(i).getText());
        	
        	list.selectByIndex(i);
        }
        
//        //for each loop
//        for(WebElement webElement : drop_down_options ) {
//        	
//        	System.out.println(webElement.getText());
//        }
//        //while
//        int z = 0;
//        while(z < drop_down_options.size()) {
//        	System.out.println(drop_down_options.get(z).getText());
//        	z++;
//        }
//        //do while
//        int w = 0;
//        do {
//        	System.out.println(drop_down_options.get(w).getText());
//        	w++;
//        }while(w < drop_down_options.size());
        
        
	}

}
