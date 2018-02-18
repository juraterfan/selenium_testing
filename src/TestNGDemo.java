import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Alyways run before any test");
	}

	@Test
	public void firstTest() {
		System.out.println("Running first test");
	}
	
	@Test
	public void secondtTest() {
		System.out.println("Running second test");
		
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Always run after any test");
	}
}

