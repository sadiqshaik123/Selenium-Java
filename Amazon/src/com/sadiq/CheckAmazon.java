package com.sadiq;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckAmazon {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Amazon\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Iphone 13");
		search.submit();
		Thread.sleep(2000);
		Windows();
		WebElement selectingphone=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a"));
		selectingphone.click();
		Thread.sleep(2000);
		Windows();
		WebElement selectingphone1=driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]"));;
		selectingphone1.click();
		Thread.sleep(2000);
		Windows();
		WebElement Login=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		Login.sendKeys("sadiqmagbul@gmail.com");
		Thread.sleep(2000);
		Login.submit();
		Thread.sleep(2000);
		Windows();
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		Password.sendKeys("Magbulsk@143");
		Password.submit();
	}
	public static void Windows() {
		Set<String> allOpenedWindows=driver.getWindowHandles();
		for(String current: allOpenedWindows) {
			driver.switchTo().window(current);
		}
	}

}
