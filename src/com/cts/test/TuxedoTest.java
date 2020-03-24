package com.cts.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TuxedoTest {
	
	@Test
	public  void mainTest() throws InterruptedException {
//
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.kohls.com/");

		Actions action = new Actions(driver);

		action.click(driver.findElement(By.id("search"))).pause(1000).sendKeys("tuxedo").pause(1000)
				.sendKeys(Keys.ENTER).pause(1000).build().perform();

		Thread.sleep(5000);

		action.click( driver.findElement(By.linkText("Featured"))).pause(1000).
		moveToElement(driver.findElement(By.xpath("//a[@rel='Price High-Low']"))).
		pause(1000).sendKeys(Keys.ENTER).build().perform();
	
	driver.findElement(By.xpath("//div[@class='prod_nameBlock']")).click();

	}
}
