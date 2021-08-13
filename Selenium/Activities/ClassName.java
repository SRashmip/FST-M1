package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/");
		System.out.println("Title of page:"+ driver.getTitle());
		WebElement about = driver.findElement(By.id("about-link"));
		about.isDisplayed();
		about.click();
		driver.close();
		
	

	}

}
