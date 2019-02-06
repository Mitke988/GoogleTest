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

public class TC11_Advertising {
	
	@Test
	
	public void verifyAdvertisingLink() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement Advertising = driver.findElement(By.xpath("//a[contains(@href, 'accounts')]"));
		String ActualAdvertisingLabel = driver.findElement(By.xpath("//a[contains(@href, 'accounts')]")).getText();

		
		// Checking if the link is displayed
		Assert.assertTrue(Advertising.isDisplayed());
		System.out.println("Advertising link is displayed");
		
		
		//Checking if the link has correct label
		Assert.assertTrue(ActualAdvertisingLabel.contains("Advertising"));
		System.out.println("Link has correct label: " + ActualAdvertisingLabel);
		
		Advertising.click();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("ads.google.com/"));
		System.out.println("Correct page is displayed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
