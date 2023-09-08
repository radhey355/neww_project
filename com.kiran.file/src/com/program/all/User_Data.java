package com.program.all;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class User_Data {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/AppData/Local/Temp/Rar$EXa11252.16674/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
       
        driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
        
        List<WebElement> row_list= driver.findElements(By.tagName("tr"));
    	
   	for (WebElement web : row_list) {
		System.out.println(web.getText()+" ");
    	
        
     
            	
         //  System.out.println("row size"+row_list.size());
           
        /*   for(int i=1;i< row_list.size();i++) {
        	   List<WebElement> col_list = row_list.get(i).findElements(By.tagName("td"));
        	   
        	   for(int j=0;j<8;j++) {
        		   System.out.print(col_list.get(j).getText()+"\t");
        		   }
        	   System.out.println(); 
        	   }
        	 System.out.println("               ==========");
        	   
        	 WebElement text = driver.findElement(By.xpath("/html/body/div[1]/footer"));
        	System.out.println(text.getText());
        	
        	
       /* 	 System.out.println("     ============");
        	WebElement table_text= driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]"));
        	 System.out.println(table_text.getText());     */
        
            	
			}
        	 
	}
}   	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
        	 
          
	


