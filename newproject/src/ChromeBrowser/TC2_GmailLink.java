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

public class TC2_GmailLink {
	
	@Test
	
	public void verifyGmailLink() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement GmailLink = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));
		String ActualGmailLink = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).getText();
		String ExpectedGmailLink = "Gmail";
		
		// Checking if the link is displayed
		Assert.assertTrue(GmailLink.isDisplayed());
		System.out.println("Gmail link is displayed");
		
		//Checking if the link has correct label ("Gmail")
		Assert.assertEquals(ExpectedGmailLink, ActualGmailLink);
		System.out.println("Gmail link has correct label");
		
		Thread.sleep(2000);
		
		//Checking if link opens "Gmail" page
		// Added that title should contain "Gmail" since the rest of the title string depends on page language
		GmailLink.click();
		Assert.assertTrue(driver.getTitle().contains("Gmail"));
		System.out.println("Gmail link opens Gmail page - Test is completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
