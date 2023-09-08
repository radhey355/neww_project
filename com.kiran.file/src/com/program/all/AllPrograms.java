package com.program.all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllPrograms {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa8592.6088/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
//      driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
        driver.findElement(By.linkText("Register a new membership")).click();
        
        driver.findElement(By.name("name")).sendKeys("Radhey");
		driver.findElement(By.id("mobile")).sendKeys("7717726939");
		driver.findElement(By.id("email")).sendKeys("saran35515Q@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("http://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		driver.quit();
		
		
      
	}
}