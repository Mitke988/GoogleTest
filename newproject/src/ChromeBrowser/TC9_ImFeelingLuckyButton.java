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

public class TC9_ImFeelingLuckyButton {
	
	@Test
	
	public void verifyImFeelingLuckyButton() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
		WebElement ImFeelingLuckyButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[2]"));
		
		
		// Checking if the button is displayed and enabled
		Assert.assertTrue(ImFeelingLuckyButton.isDisplayed());
		System.out.println("I'm Feeling Lucky button is displayed");
		Assert.assertTrue(ImFeelingLuckyButton.isEnabled());
		System.out.println("I'm Feeling Lucky button is enabled");
		
		Thread.sleep(2000);
		
		ImFeelingLuckyButton.click();
		Assert.assertTrue(driver.getCurrentUrl().contains("www.google.com/doodles/"));
		System.out.println("I'm Feeling Lucky button is working correctly - Test is completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
