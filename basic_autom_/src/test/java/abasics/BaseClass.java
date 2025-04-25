package abasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class BaseClass {

	@Test
	public void BC() throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com");
	
	System.out.println("Executed Success");
		
	}
	
	

	

}
