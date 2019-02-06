package ChromeBrowser;

import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class TC1_PageTitle {
	
	@Test
	
	public void verifyPageTitle() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		String ActualPageTitle = driver.getTitle();
		System.out.println("Actual page title: " + ActualPageTitle);
		
		String ExpectedPageTitle = "Google";
		
		Assert.assertEquals(ExpectedPageTitle, ActualPageTitle);
		
		System.out.println("Test is completed");
		
		driver.close();
	}

}
