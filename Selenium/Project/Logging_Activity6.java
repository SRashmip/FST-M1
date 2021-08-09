package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Logging_Activity6 {
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
		
		WebElement Account = driver
				.findElement(By.xpath("//*[@id='primary-menu']/li[@id='menu-item-1507']/a"));
		
		Account.click();
		String accountpagetitle = driver.getTitle();
		Assert.assertEquals(accountpagetitle, "My Account – Alchemy LMS");
		WebElement loginbtn = driver.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']"));
		loginbtn.click();
	   String username = driver.findElement(By.xpath("(//*[@id='loginform']/p/label)[1]")).getText();
	   Assert.assertEquals(username, "Username or Email Address");
	   //verify input box and enter username
	   WebElement userlogin = driver.findElement(By.xpath("(//*[@id='loginform']/p/input)[1]"));
	   userlogin.sendKeys("root");
	   String password = driver.findElement(By.xpath("(//*[@id='loginform']/p/label)[2]")).getText();
	   Assert.assertEquals(password, "Password");
	   WebElement userpass = driver.findElement(By.xpath("(//*[@id='loginform']/p/input)[2]"));
	   userpass.sendKeys("pa$$w0rd");
	   WebElement remember = driver.findElement(By.xpath("(//*[@id='loginform']/p/label)[3]"));
	   remember.isDisplayed();
	  
	   WebElement login = driver.findElement(By.xpath("//*[@id='wp-submit']"));
	   login.click();
	   Thread.sleep(2000);
	   String userverfication = driver.findElement(By.xpath("//*[@class='quicklinks']/ul[2]/li[@id='wp-admin-bar-my-account']/a")).getText();
	   Assert.assertEquals(userverfication, "Howdy, root");
	   System.out.println("User has logged in successfully");
		
	}

	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}


}
