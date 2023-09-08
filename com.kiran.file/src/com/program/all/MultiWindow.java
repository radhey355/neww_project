package com.program.all;

import java.awt.AWTException;
import java.awt.Button;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiWindow {
	
    // window handle of multiple window
	
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa11252.16674/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
//              login	
		
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
        
 //              All Multiple window open   
        
        driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();
		Thread .sleep(3000);
		
//              close all windows except the first one	
		
		List<String> ar =new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(ar.size());
	for (int i = 0; i < ar.size(); i++) {
		if (i!=0)
		{
		    driver.switchTo().window(ar.get(i));
		    
			driver.close();
			
		}
	}      
	}

}
