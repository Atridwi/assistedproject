package com.QA.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
    public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		// Check if the element is displayed
		
		boolean dis = driver.findElement(By.id("searchInput")).isDisplayed();

		System.out.println("IS the element displayed ?" + dis);
		
		// check if the element is enabled or not
		
		boolean enb = driver.findElement(By.id("searchInput")).isEnabled();
		
		System.out.println("IS the element enabled ?" + enb);
		
		// Enter data in the webelement - input box
		
		if(enb==true)
		{
//			Locator by id
//		driver.findElement(By.id("searchInput")).sendKeys("Automation testing");
//			Locator by name
//			driver.findElement(By.name("search"));
//			Locator by classname
//			driver.findElement(By.className("search-input"));
//			by tagname
//			 driver.findElement(By.tagName("input"));
//			by linktext
//			driver.findElement(By.linkText("English")).click();
//			by partial linktext
//			driver.findElement(By.partialLinkText("Eng")).click();
//			by css selector
//			driver.findElement(By.cssSelector("input[name='search']"));
//			driver.findElement(By.cssSelector("input#first_name")).sendKeys("Hello");
		    
		    //driver.findElement(By.cssSelector("input.required")).sendKeys("Howdy");
		    
//		 by xpath
//			Absolute xpath
//driver.findElement(By.xpath("/html/body/div[2]/div[1]/a/strong"));
//			Relative xpath
//			by unique attribute
//			driver.findElement(By.xpath("//input[@id='searchInput']"));
//			by text()
//			driver.findElement(By.xpath("//strong[text()='English']"));
//			by multiple attributes and
//			driver.findElement(By.xpath("//input[@id='searchInput' and @name='search']"));
//			by multiple attributes or
//			driver.findElement(By.xpath("//input[@id='searchInput' or @name='search']"));

			//			by contains
//			driver.findElement(By.xpath("//input[contains(@name,'search')]"));
//			by startswith
//			driver.findElement (By.xpath("//input[starts-with(@id,'search')]"));
			
			
			
		}
		else
		{
			System.out.println("textbox is not enabled");
		}
		
}
}
