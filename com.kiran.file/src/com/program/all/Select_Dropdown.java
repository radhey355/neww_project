package com.program.all;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Dropdown {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.get("file:///C:/Users/HP/Downloads/JARS/selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.xpath("(//*[text()='Users'])[1]")).click();
        driver.findElement(By.xpath("//*[text()= 'Add User']")).click();
        WebElement dropdown =driver.findElement(By.xpath("//Select"));
        Select drop= new Select(dropdown);
        drop.selectByIndex(1);
        
        Thread.sleep(2000);
        driver.quit();

	}

}
