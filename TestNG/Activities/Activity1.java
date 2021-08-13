package TestNgproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	 WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	//Create a new instance of the Firefox driver
  driver = new FirefoxDriver();
      
      //Open browser
      driver.get("https://www.training-support.net");
  }
  
  @Test
  public void Testcase() {
	  String title = driver.getTitle();
	  System.out.println("Page title is: " + title);
	  Assert.assertEquals("Training Support", title);
	  driver.findElement(By.id("about-link")).click();
	  System.out.println("New page title is: " + driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "About Training Support");
  }

  @AfterMethod
  public void afterMethod() {
      //Close the browser
      driver.quit();
  }

}
