package com.program.all;

import java.util.List;

import javax.swing.ListCellRenderer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opetaors_Text {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa11252.16674/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
        driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a")).click();
       
    //  System.out.println( driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div")).getText());
        driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div")).click();
        
        List<WebElement> row_text = driver.findElements(By.tagName("tr"));
        for(int i=1;i< row_text.size();i++) {
        	
        	List<WebElement> col_text = row_text.get(i).findElements(By.tagName("td"));
        	for(int j=0;j<col_text.size();j++) {
        		
        		System.out.print(col_text.get(j).getText()+"\t");
        	}
        	System.out.println();
        }
     
     
    		 
    		 
     }
      
         	 }
    		 
    	
  
    	 
       
	


