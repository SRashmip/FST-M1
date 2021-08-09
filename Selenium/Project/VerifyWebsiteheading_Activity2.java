package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyWebsiteheading_Activity2 {
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
		String Actualheader = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
		 
		Assert.assertEquals(Actualheader, "Learn from Industry Experts");
	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
