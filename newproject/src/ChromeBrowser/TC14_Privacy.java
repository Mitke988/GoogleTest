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

public class TC14_Privacy {
	
	@Test
	
	public void verifyPrivacyLink() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement Privacy = driver.findElement(By.xpath("//a[contains(@href, 'policies/privacy')]"));
		String ActualPrivacyLabel = driver.findElement(By.xpath("//a[contains(@href, 'policies/privacy')]")).getText();

		// Checking if the link is displayed
		Assert.assertTrue(Privacy.isDisplayed());
		System.out.println("Privacy link is displayed");
		
		
		//Checking if the link has correct label
		Assert.assertTrue(ActualPrivacyLabel.contains("Privacy"));
		System.out.println("Link has correct label: " + ActualPrivacyLabel);
		
		Privacy.click();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("policies.google.com/privacy"));
		System.out.println("Correct page is displayed - Test is completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
