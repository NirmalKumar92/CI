package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
public class Sample {
	
	
	
	
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.gmail.com");
			driver.findElement(By.name("Email")).sendKeys("bharathkumarkarthick@gmail.com");
	        Thread.sleep(1000);
	        driver.findElement(By.name("signIn")).click();
	        Thread.sleep(10000);
	        
	       
	        
	        
	        
		
	}

}
