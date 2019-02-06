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

public class TC6_Logo {
	
	@Test
	
	public void verifyLogo() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement LogoHP = driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
		
		// Checking if the logo is displayed
		Assert.assertTrue(LogoHP.isDisplayed());
		System.out.println("Logo is displayed");
		
		Thread.sleep(2000);
		
		//Checking if logo link returns the user to the homepage
		
		WebElement searchTest = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		searchTest.sendKeys("Test");
		searchTest.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		WebElement Logo = driver.findElement(By.xpath("//*[@id=\"logo\"]"));
		Logo.click();
		
		Assert.assertTrue(driver.getTitle().contentEquals("Google"));
		
		System.out.println("Logo is working correctly - Test is completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
