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

public class TC10_GoogleOfferedInSection {
	
	@Test
	
	public void verifyGoogleOfferedInSection() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement Label = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]"));
		String ActualLabel = driver.findElement(By.xpath("//*[@id=\"SIvCob\"]")).getText();
		
		// Checking if the text is displayed
		Assert.assertTrue(Label.isDisplayed());
		System.out.println("Label is displayed");
		
		Assert.assertTrue(ActualLabel.contains("Google offered"));
		System.out.println("Gmail link has correct label: " + ActualLabel);
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
