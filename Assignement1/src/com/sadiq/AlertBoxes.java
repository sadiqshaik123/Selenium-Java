package com.sadiq;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Assignement1\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Java\\Assignement1\\Resources\\AlertBoxes.html");
		
		
		WebElement simpleAlertButton = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		simpleAlertButton.click();
		Thread.sleep(2000);
		Alert simpleAlertBox = driver.switchTo().alert();
		simpleAlertBox.accept();
		
		
		WebElement promptAlertButton = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		promptAlertButton.click();	
		Thread.sleep(2000);
		Alert promptAlertBox = driver.switchTo().alert();
		promptAlertBox.sendKeys("Lets Make Automation Easy");
		promptAlertBox.accept();
		
		
		WebElement confirmAlertButton = driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
		confirmAlertButton.click();
		Thread.sleep(2000);
		Alert confirmAlertBox = driver.switchTo().alert();
		confirmAlertBox.dismiss();
		
		

	}

}
