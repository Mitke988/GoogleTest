package ChromeBrowser;

import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

public class TC4_GoogleApps {
	
	@Test
	
	public void verifyPageTitle() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement GoogleApps = driver.findElement(By.xpath("//a[contains(@href, 'about/products?')][@role=\"button\"]"));
		
		// Checking if the button is displayed and enabled
		Assert.assertTrue(GoogleApps.isDisplayed());
		System.out.println("Google Applications button is displayed");
		
		Assert.assertTrue(GoogleApps.isEnabled());
		System.out.println("Google Applications button is enabled");
		
		Thread.sleep(2000);
		
		//Checking if the overlay is displayed
		GoogleApps.click();
		WebElement GoogleAppsOverlay = driver.findElement(By.xpath("//*[@class=\"gb_ea gb_7\"]"));
		
		Thread.sleep(2000);
		
		Assert.assertTrue(GoogleAppsOverlay.isDisplayed());
		System.out.println("Google Applications overlay is displayed - Test is completed");
		
		Thread.sleep(2000);
		
		driver.close(); 
	}

}
