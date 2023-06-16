package com.test;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import io.github.bonigarcia.wdm.WebDriverManager;


public class Third {  
  
    public static void main(String[] args) {  
      
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

           // Launch Website  
        driver.navigate().to("https://www.google.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
  
    }  
  
}  