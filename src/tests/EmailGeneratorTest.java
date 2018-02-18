package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.EmailGenerator;

public class EmailGeneratorTest {

	@Test
	public void domainTest() {
		String actual = EmailGenerator.generate("Erfan");
		System.out.println(actual);
	    String company = "cybertek.com";
	    
	   
	    Assert.assertTrue(actual.contains(company));
	    
	    }
	
	@Test
	public void emailMatchesTest() {
		String actual = EmailGenerator.generate("Erfan");
		String expected = "erfan@cybertek.com";
		
		Assert.assertEquals(actual, expected);
		
	}
	}
	

