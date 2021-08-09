package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifySecondinfoBox_Activity4 {
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		String Actualinfo = driver
				.findElement(By.xpath("//*[@class='ld_course_grid col-sm-8 col-md-4 ']/article[@id='post-71']/div[2]/h3"))
				.getText();
		System.out.println(Actualinfo);

		Assert.assertEquals(Actualinfo, "Email Marketing Strategies");
	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}
}
