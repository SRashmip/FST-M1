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

public class ContactAdmin_Activity8 {
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
		WebElement Contact = driver
				.findElement(By.xpath("//*[@class='main-navigation']/ul/li[4]/a"));
		
		Contact.click();
		String Contactpagetilte = driver.getTitle();
		Assert.assertEquals(Contactpagetilte, "Contact – Alchemy LMS");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		VerifyFormFields();
		
}
	public void VerifyFormFields() throws InterruptedException {
		String fullname = driver.findElement(By.xpath("//*[@id='wpforms-8-field_0-container']/label")).getText();
		Assert.assertEquals(fullname, "Full Name *");
		WebElement Entername = driver.findElement(By.xpath("//*[@id='wpforms-8-field_0-container']/input"));
		Entername.sendKeys("Rashmi");
		String Email = driver.findElement(By.xpath("//*[@id='wpforms-8-field_1-container']/label")).getText();
		Assert.assertEquals(Email, "Email *");
		WebElement Enteremail = driver.findElement(By.xpath("//*[@id='wpforms-8-field_1-container']/input"));
		Enteremail.sendKeys("rashmp97@in.ibm.com");
		String subject = driver.findElement(By.xpath("//*[@id='wpforms-8-field_3-container']/label")).getText();
		Assert.assertEquals(subject, "Subject");
		WebElement Entersubject = driver.findElement(By.xpath("//*[@id='wpforms-8-field_3-container']/input"));
		Entersubject.sendKeys("Testmail");
		String comment = driver.findElement(By.xpath("//*[@id='wpforms-8-field_2-container']/label")).getText();
		Assert.assertEquals(comment, "Comment or Message *");
		WebElement Entermessage = driver.findElement(By.xpath("//*[@id='wpforms-8-field_2-container']/textarea[@id='wpforms-8-field_2']"));
		Entermessage.sendKeys("Ignore the mail it is part of sdet lms project");
		WebElement button = driver.findElement(By.xpath("//*[@class='wpforms-submit-container']/button"));
		button.click();
		//Verify the confirmation message
		Thread.sleep(2000);
		String confirmmsg = driver.findElement(By.xpath("//*[@class='wpforms-confirmation-container wpforms-confirmation-scroll']/p")).getText();
		Assert.assertEquals(confirmmsg, "Thanks for contacting us! We will be in touch with you shortly.");
		System.out.println("Final message:"+confirmmsg );
	}
	@AfterMethod
	public void afterMethod() {
		// Close the browser
		driver.quit();
	}
}
