package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("Title of page:" + driver.getTitle());
		WebElement about = driver.findElement(By.id("about-link"));
		Thread.sleep(5000);
		about.isDisplayed();
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("arguments[0].click();", about);
		 */

		System.out.println("text of about us cta:" + about.getText());
		// use class name to find about us text
		WebElement aboutclass = driver.findElement(By.className("green"));
		Thread.sleep(5000);

		System.out.println("text of about us cta:" + aboutclass.getText());
		// use css selector to get about us text
		WebElement aboutselector = driver.findElement(By.cssSelector(".green"));
		Thread.sleep(5000);

		System.out.println("text of about us cta:" + aboutselector.getText());
		// use linktext to get about us text
		WebElement aboutlink = driver.findElement(By.linkText("About Us"));
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", aboutlink);
		System.out.println("text of about us cta:" + aboutlink.getText());

		driver.close();

	}

}
