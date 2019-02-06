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

public class TC16_Settings {
	
	@Test
	
	public void verifySettingsLink() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement Settings = driver.findElement(By.xpath("//a[contains(@href, 'preferences')]"));
		String ActualSettingsLabel = driver.findElement(By.xpath("//a[contains(@href, 'preferences')]")).getText();

		// Checking if the link is displayed
		Assert.assertTrue(Settings.isDisplayed());
		System.out.println("Settings link is displayed");
		
		
		//Checking if the link has correct label
		Assert.assertTrue(ActualSettingsLabel.contains("Settings"));
		System.out.println("Link has correct label: " + ActualSettingsLabel);
		
		Settings.click();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"fsett\"]")).isDisplayed());
		System.out.println("Popup is displayed correctly - Test completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
