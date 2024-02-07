package com.sadiq;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Assignment5\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\Java\\Assignment5\\resources\\LMAE_MainWindow.html");
		
		WebElement firstclick=driver.findElement(By.xpath("//a[text()='FAQ (Frquently Asked Qusetion)']"));
		firstclick.click();
		Thread.sleep(2000);
		Set<String> allOpenedWindowIds = driver.getWindowHandles();
		for (String currWindowId : allOpenedWindowIds) {
			driver.switchTo().window(currWindowId);
			
			
		}
		WebElement prompt=driver.findElement(By.id("ques"));
		Thread.sleep(3000);
		prompt.sendKeys("SadiqShaik");
		
		

	}

}
