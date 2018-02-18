package utilities;

import org.openqa.selenium.WebElement;

public class BrowserUtils {

		public static void checkBoxSelected(WebElement checkbox) {
			if(checkbox.isSelected()) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
		}
}
