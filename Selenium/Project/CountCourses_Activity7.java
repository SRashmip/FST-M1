package Activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountCourses_Activity7 {
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
		List<WebElement> Courselist = driver.findElements(By.xpath("//*[@class='ld_course_grid col-sm-8 col-md-4 ']/article/div[2]/h3"));
		int courses = Courselist.size();
		System.out.println("Total courses:"+ courses);
		for(int i =1;i<=courses;i++) {
			String names = driver.findElement(By.xpath("(//*[@class='ld_course_grid col-sm-8 col-md-4 ']/article/div[2]/h3)["+i+"]")).getText();
			System.out.println("Names of courses:"+ names);
		}
		
	}
	

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}

}
