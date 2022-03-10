package com.QA.SeleniumScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//through typecasting
		TakesScreenshot ts=(TakesScreenshot)driver;
         //takescreenshot and store it in heap area
		File src = ts.getScreenshotAs(OutputType.FILE);
		//store in our local machine
		//give path+filename+extension
		File dest=new File("C:\\Users\\Nandini\\OneDrive\\Desktop\\googleimp.jpg");
		//copy file from src to dest
		Files.copy(src, dest);
			Thread.sleep(2000);	
		driver.close();	
	}

}
