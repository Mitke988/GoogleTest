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

public class TC3_ImagesLink {
	
	@Test
	
	public void verifyImagesLink() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement ImagesLink = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a"));
		String ActualImagesLink = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[2]/a")).getText();
		String ExpectedImagesLink = "Images";
		
		// Checking if the link is displayed
		Assert.assertTrue(ImagesLink.isDisplayed());
		System.out.println("Images link is displayed");
		
		//Checking if the link has correct label
		Assert.assertEquals(ExpectedImagesLink, ActualImagesLink);
		System.out.println("Images link has correct label");
		
		Thread.sleep(2000);
		
		//Checking if link leads to the correct page
		ImagesLink.click();
		Assert.assertTrue(driver.getTitle().contentEquals("Google Images"));
		System.out.println("Link is working correctly - Test is completed");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
