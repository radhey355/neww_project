package com.close;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Close {
	
	@Test
	public void test01() throws Exception {
		
//    System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)");	        
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		System.out.println("main");
//		driver.findElement(By.xpath("//*[@target='_blank']//following-sibling::button")).click();
//		Thread.sleep(3000);
//		
//		driver.close();
		
	}

}
