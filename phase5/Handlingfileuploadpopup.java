package com.QA.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingfileuploadpopup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
        Thread.sleep(2000);
//        hidden division popup will be appended
       WebElement uploadbtn = driver.findElement(By.id("file-upload"));
		uploadbtn.sendKeys("C:\\Users\\Nandini\\OneDrive\\Desktop\\nandu files\\Nandini.pdf");
		
		
		
	}

}
