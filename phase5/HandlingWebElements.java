package com.QA.SeleniumScripts;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingWebElements {
	public static void main(String args[]) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
//	      driver.get("https://www.google.com/");
//	      Thread.sleep(3000);
	      
	      
	      //editbox
//	    WebElement edit = driver.findElement(By.name("q"));
//	    edit.sendKeys("automation testing");
	    
	    //link
//	      driver.findElement(By.className("gb_d")).click();
		 
		 
	    //button
//	      driver.findElement(By.linkText("Sign in")).click();
//	      image link
//	      driver.findElement(By.id("hplogo")).click();
		 
		 
//	    text area
//	      WebElement edit = driver.findElement(By.name("q"));
//		    edit.sendKeys("automation testing");
//		    Thread.sleep(2000);
//		    edit.clear();
//		    Thread.sleep(2000);
//		    edit.sendKeys("Selenium scripts");
		 
		 
//		 checkbox   
//	      driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//	        driver.findElement(By.xpath("//input[@value='red']")).click();
//	        Thread.sleep(3000);
//	        driver.findElement(By.xpath("//input[@value='blue']")).click();
//	        Thread.sleep(2000);
		 
//		 radiobutton
//		 driver.get("https://www.ironspider.ca/forms/checkradio.htm");
//	        WebElement loc = driver.findElement(By.xpath("//input[@name='browser'][3]"));
//	        
//	        Thread.sleep(3000);
//	       boolean cond = loc.isSelected();
//	        if(cond==false) {
//	        	loc.click();
//	        	
//	        }
//	        else {
//	        	System.out.println("radio button already checked ");
//	        }
	   
	        
//	     dropdownlist   
	        
//	        driver.get("https://www.amazon.com/");
//	       WebElement loc = driver.findElement(By.xpath("//select[contains(@id,'search')]"));
//	   
//	        Select dd = new Select(loc);
//	        
//	        dd.selectByIndex(5);
//	        
//	        Thread.sleep(2000);
//	        
//	        dd.selectByValue("search-alias=computers-intl-ship");
//	        
//	        Thread.sleep(2000);
//	        
//	        dd.selectByVisibleText("Baby");
	        
//		 driver.get("http://demo.guru99.com/test/web-table-element.php");         
//	        //No.of Columns
//	        List <WebElement> col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//	        System.out.println("No of cols are : " +col.size()); 
//	        //No.of rows 
//	        List <WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
//	        System.out.println("No of rows are : " + rows.size());
//	     
		 
//		 frames
//		 driver.get("http://demo.guru99.com/test/guru99home/");
//		 driver.switchTo().frame("a077aa5e");
//		 driver.findElement(By.xpath("html/body/a/img")).click();

//		 swithing between windows
		 driver.get("https://www.google.co.in/?gws_rd=ssl");       
		  driver.findElement(By.linkText("Gmail")).sendKeys(Keys.CONTROL,Keys.RETURN);
		  
		  String Tab1 = driver.getWindowHandle(); 
		  ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles()); 
		  if (!availableWindows.isEmpty()) { 
		  driver.switchTo().window(availableWindows.get(1)); 
		  }

	        Thread.sleep(3000);
	        driver.close();
	      
	}

}
