package com.sadiq;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
public class WorldPopulation {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException{
		
		String Current_pop="//div[@class='maincounter-number']/span[@class='rts-counter']";
		String year_day="//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		System.setProperty("webdriver.chrome.driver", "D:\\Java\\Population\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		for(int i=1;i<=20;i++) {
			System.out.println(i+"sec");
			System.out.println("--------current Population----------------");
			populationData(Current_pop);
			System.out.println("--------------Today and this Year---------------");
			populationData(year_day);
			System.out.println("=============================================");
			Thread.sleep(1000);
		}
		

	}
	public static void populationData(String str) throws InterruptedException {
		List<WebElement>popList=driver.findElements(By.xpath(str));
		for(WebElement e : popList) {
			System.out.println(e.getText());
		}
	}

}
