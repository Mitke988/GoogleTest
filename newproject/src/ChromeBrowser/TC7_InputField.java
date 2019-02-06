package ChromeBrowser;

import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class TC7_InputField {
	
	@Test
	
	public void verifyInputField() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement inputField = driver.findElement(By.xpath("//input[@name='q']"));
				
		// Checking if the field is displayed
		Assert.assertTrue(inputField.isDisplayed());
		System.out.println("Input field is displayed");
		
		Assert.assertTrue(inputField.isEnabled());
		System.out.println("Input field is enabled");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
