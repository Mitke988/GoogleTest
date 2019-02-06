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

public class TC12_Business {
	
	@Test
	
	public void verifyBusinessLink() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement Business = driver.findElement(By.xpath("//a[contains(@href, 'services')]"));
		String ActualBusinessLabel = driver.findElement(By.xpath("//a[contains(@href, 'services')]")).getText();

		
		// Checking if the link is displayed
		Assert.assertTrue(Business.isDisplayed());
		System.out.println("Business link is displayed");
		
		
		//Checking if the link has correct label
		Assert.assertTrue(ActualBusinessLabel.contains("Business"));
		System.out.println("Link has correct label: " + ActualBusinessLabel);
		
		Business.click();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("www.google.com/services/"));
		System.out.println("Correct page is displayed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
