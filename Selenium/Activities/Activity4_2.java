package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("Title of page:" + driver.getTitle());
		//Find the input fields and enter text
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
 
        firstName.sendKeys("Saahil");
        lastName.sendKeys("Sharma");
 
        //Enter the email
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("test@example.com");
 
        //Enter the contact number
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("1234567890");
 
        //Enter Message
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
 
        //Click Submit
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
    }

	}


