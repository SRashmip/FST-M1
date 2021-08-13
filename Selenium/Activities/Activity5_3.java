package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of page:" + driver.getTitle());
		WebElement inputtxt = driver.findElement(By.xpath("//div[@id='dynamicText']/input"));
		System.out.println("Check that text field is enabled:"+ inputtxt.isEnabled());
		driver.findElement(By.id("toggleInput")).click();
		System.out.println("Check that field is enabled:" +inputtxt.isEnabled() );
		driver.close();
	}

}
