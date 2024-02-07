package com.sadiq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Assignment3\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Java\\Assignment3\\Resources\\LMAE_InputBox.html");
		WebElement prompt=driver.findElement(By.className("channelNameClass"));
		Thread.sleep(3000);
		prompt.sendKeys("Shaik Sadiq");
		

	}

}
