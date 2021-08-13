package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		System.out.println("Title of page:" + driver.getTitle());
		 WebElement checkboxInput = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
	        System.out.println("The checkbox Input is selected: " + checkboxInput.isSelected());
	        checkboxInput.click();
	        System.out.println("The checkbox is selected:"+ checkboxInput.isSelected());
	        driver.close();
	}

}
