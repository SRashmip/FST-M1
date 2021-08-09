package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleLesson_Activity9 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {

		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Open browser
		driver.get("https://alchemy.hguy.co/lms");
	}
	@Test
	public void Testcase() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		
		WebElement Allcourses = driver
				.findElement(By.xpath("//*[@class='main-navigation']/ul/li[2]/a"));
		
		Allcourses.click();
		String Coursespagetilte = driver.getTitle();
		Assert.assertEquals(Coursespagetilte, "All Courses – Alchemy LMS");
		String Coursesheader = driver.findElement(By.xpath("//*[@class='uagb-ifb-title-wrap']/h1")).getText();
		Assert.assertEquals(Coursesheader, "All Courses");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement firstcourse = driver.findElement(By.xpath("(//*[@class='ld_course_grid col-sm-8 col-md-4 ']/article/div[2]/p[@class='ld_course_grid_button']/a)[1]"));
		firstcourse.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		WebElement strategy = driver.findElement(By.xpath("(//*[@class='ld-item-list-items ld-lesson-progression']/div)[1]"));
		Actions action = new Actions(driver);
        //Performing the mouse hover action on the target element.
		action.moveToElement(strategy).perform();
		
		
		
		
}
	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}
}