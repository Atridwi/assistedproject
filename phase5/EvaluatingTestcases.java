package com.phase5.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EvaluatingTestcases {
    
    SoftAssert soft = new SoftAssert();
    WebDriver driver;
    @Test
    public void Launch() {
         driver = new ChromeDriver();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(dependsOnMethods = { "Launch" })
    public void Facebook() {
        driver.get("https://www.facebook.com");
        soft.assertEquals("Facebook – log in or sign up", driver.getTitle());   //testcase pass
//        soft.assertEquals("FB Title", driver.getTitle());   //testcase fails
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test(dependsOnMethods = { "Facebook" })
    public void Login() {
        driver.findElement(By.id("email")).sendKeys("nandhinigorkal@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        soft.assertAll();
        
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
