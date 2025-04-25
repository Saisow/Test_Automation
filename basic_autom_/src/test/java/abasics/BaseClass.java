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
		
		WebDriver driver;
		String browser = System.getProperty("BROSWER");
		
		//String browser = System.getProperty("browser");
		switch(browser) {
		
		case "chrome" :
			
			driver = new ChromeDriver();
			break;
			
		case "edge" :
			
			driver = new EdgeDriver();
			break;
			
		case "Firefox" :
			
			driver = new FirefoxDriver();
			break;
		
		}
		
	System.out.println("Executed Success");
		
	}
	
	

	

}
