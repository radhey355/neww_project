package com.program.all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Try {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa11252.16674/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
        
        driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a")).click();
        
        List<WebElement> row = driver.findElements(By.tagName("tr"));
        for(int i=0;i<row.size();i++) {
        	List<WebElement> col= row.get(i).findElements(By.tagName("td"));
        	for(int j=0;j<col.size();j++) {
        		System.out.print(col.get(j).getText()+"\tn");
        	}
        	System.out.println();
        }
        
	}

}
