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

public class TC15_Terms {
	
	@Test
	
	public void verifyTermsLink() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement Terms = driver.findElement(By.xpath("//a[contains(@href, 'terms')]"));
		String ActualTermsLabel = driver.findElement(By.xpath("//a[contains(@href, 'terms')]")).getText();

		// Checking if the link is displayed
		Assert.assertTrue(Terms.isDisplayed());
		System.out.println("Terms link is displayed");
		
		//Checking if the link has correct label
		Assert.assertTrue(ActualTermsLabel.contains("Terms"));
		System.out.println("Link has correct label: " + ActualTermsLabel);
		
		Terms.click();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("policies.google.com/terms"));
		System.out.println("Correct page is displayed - Test is completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
