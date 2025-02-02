package StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertTestSteps {
WebDriver driver;
WebDriverWait wait;
Alert alert;

@Given("^User is on the page$")
public void Page() {
	driver = new FirefoxDriver();
	wait = new WebDriverWait(driver,10);
	driver.get("https://www.training-support.net/selenium/javascript-alerts");
}
@When("^User clicks the Simple Alert button$")
public void ClickSimpleAlert() {
	driver.findElement(By.xpath("//*[@class='activity content']/div/div[2]/button[@id='simple']")).click();
}
@When("^User clicks the Confirm Alert button$")
public void ClickConfirmAlert() {
	driver.findElement(By.xpath("//*[@class='activity content']/div/div[2]/button[@id='confirm']")).click();
}
@When("^User clicks the Prompt Alert button$")
public void ClickPromptAlert() {
	driver.findElement(By.xpath("//*[@class='activity content']/div/div[2]/button[@id='prompt']")).click();
}
@Then("^Alert opens$")
public void FocusSwitch() {
	alert = driver.switchTo().alert();
}
@And("^Read the text from it and print it$")
public void ReadAlert() {
	System.out.println("Alert says: " + alert.getText());
}
@And("^Write a custom message in it$")
public void Writepromptmessage() {
	alert.sendKeys("Custom Message");
}
@And("^Close the alert$")
public void closeAlert() {
    alert.accept();
}
@And("^Close the alert with Cancel$")
public void closeAlertWithCAncel() {
    alert.dismiss();
}
@And("^Close Browser$")
public void closeBrowser() {
    driver.close();
}
}
