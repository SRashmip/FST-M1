package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyMyaccount_Activity5 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {

		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	public void Testcase() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		WebElement Account = driver
				.findElement(By.xpath("//*[@id='primary-menu']/li[@id='menu-item-1507']/a"));
		
		Account.click();
		String accountpagetitle = driver.getTitle();
		Assert.assertEquals(accountpagetitle, "My Account – Alchemy LMS");
	
		
	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}
}
