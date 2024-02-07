package com.sadiq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Assignment4\\Resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Java\\Assignment4\\Resources\\LMAE_FrameHandling.html");
		WebElement video1=driver.findElement(By.id("pradeepYouTubeFirstFrame"));
		WebElement video2=driver.findElement(By.id("pradeepYouTubeSecondFrame"));
		Thread.sleep(2000);
		video1.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		video2.click();
		
		

	}

}
