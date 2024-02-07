package com.sadiq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Assignment2\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Java\\Assignment2\\Resources\\LMAE_DragAndDrop.html");
		WebElement sourceElement = driver.findElement(By.id("div1"));
		WebElement targetElement = driver.findElement(By.id("div6"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceElement, targetElement).build().perform();
		driver.close();

	}

}
