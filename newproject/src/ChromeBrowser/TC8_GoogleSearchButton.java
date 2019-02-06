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

public class TC8_GoogleSearchButton {
	
	@Test
	
	public void verifyGoogleSearchButton() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	
		WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
		
		// Checking if the button is displayed and enabled
		Assert.assertTrue(SearchButton.isDisplayed());
		System.out.println("Search button is displayed");
		Assert.assertTrue(SearchButton.isEnabled());
		System.out.println("Search button is enabled");
		
		//Checking if the button has correct label ("Google Search")
		
		Assert.assertTrue(SearchButton.equals("Google Search"));
		
		Thread.sleep(2000);
		
		//Functionalities will be covered via "TC_ShowingTimeSearch"
		
		driver.close();
	}

}
