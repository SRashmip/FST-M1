package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("Title of page:" + driver.getTitle());
		driver.findElement(By.xpath("//*[@class='ui text container']/a")).click();
		 System.out.println("Heading is: " + driver.getTitle());
		 
	        //Close the browser
	        driver.close();
	}

}
