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

public class TC5_SignIn {
	
	@Test
	
	public void verifySignInButton() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement SignInButton = driver.findElement(By.xpath("//a[contains(@href, 'accounts')]"));
		String ActualSignInLabel = driver.findElement(By.xpath("//a[contains(@href, 'accounts')]")).getText();
		String ExpectedSignInLabel = "Sign In";
		
		// Checking if the button is displayed
		Assert.assertTrue(SignInButton.isDisplayed());
		System.out.println("Sign In button is displayed");
		
		//Checking if the button has correct label
		Assert.assertEquals(ExpectedSignInLabel, ActualSignInLabel);
		System.out.println("Button has correct label");
		
		Thread.sleep(2000);
		
		//Checking if buttons works correctly
		SignInButton.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("accounts.google.com/"));
		System.out.println("Link is working correctly - Test is completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
