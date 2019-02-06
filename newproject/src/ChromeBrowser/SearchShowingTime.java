package ChromeBrowser;

import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.NoSuchElementException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.remote.ProtocolHandshake;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchShowingTime {
	
	@Test
	
	public void verifyPageTitle() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebDriverWait hold = new WebDriverWait(driver, 10);
		
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("ShowingTime");
		
		WebElement searchShowingTime = hold.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]")));
		searchShowingTime.click();
		
		Thread.sleep(2000);
		
		//xpath bellow is displayed for first result (checked for multiple search resuls)
		WebElement TopResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div"));
		WebElement ShowingTimeResult = TopResult.findElement(By.partialLinkText("www.showingtime.com"));
		ShowingTimeResult.click();
	
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getCurrentUrl().contentEquals("https://www.showingtime.com/"));
		System.out.println("ShowingTime website is displayed");
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
