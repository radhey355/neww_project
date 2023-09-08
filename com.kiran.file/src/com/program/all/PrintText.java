package com.program.all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintText {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); 
		driver.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa11252.16674/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
 //       driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
        driver.findElement(By.linkText("Register a new membership")).click();
        
/*        driver.findElement(By.name("name")).sendKeys("Radhey");
		driver.findElement(By.id("mobile")).sendKeys("7717726939");
		driver.findElement(By.id("email")).sendKeys("saran35515@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[5]/div/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com"); (present by default)
	        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
	      driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();        */

        
		
		  List<WebElement> list=driver.findElements(By.tagName("input"));
			
			System.out.println("Size => "+list.size());
			
			
			for(int i=0;i<list.size();i++) {
				
			System.out.println(list.get(i).getAttribute("placeholder"));			
				
				if(list.get(i).getAttribute("placeholder").compareTo("Email")==0)
	             {   
					System.out.println("email access..");

			     }
				else if(list.get(i).getAttribute("placeholder").compareTo("Password")==0) {
				System.out.println("password assessed....");
						
					}
				}
		}                                                                     
		}

	
	
