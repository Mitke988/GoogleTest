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

public class TC13_About {
	
	@Test
	
	public void verifyAboutLink() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement About = driver.findElement(By.xpath("//*[@id=\"fsl\"]/a[3]"));
		String ActualAboutLabel = driver.findElement(By.xpath("//*[@id=\"fsl\"]/a[3]")).getText();

		// Checking if the link is displayed
		Assert.assertTrue(About.isDisplayed());
		System.out.println("About link is displayed");
		
		//Checking if the link has correct label
		Assert.assertTrue(ActualAboutLabel.contains("About"));
		System.out.println("Link has correct label: " + ActualAboutLabel);
		
		About.click();
		
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.getTitle().contains("About"));
		System.out.println("Correct page is displayed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
