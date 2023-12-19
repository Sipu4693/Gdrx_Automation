package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

    import com.utility.Base;





	public class Checkout extends Base
	{
	  @Test
	  public static void checkout() throws Exception
	  {
		  
		/*  WebDriverWait wait = new WebDriverWait(driver ,10);
		  wait.until(ExpectedConditions.
		          elementToBeClickable(driver.findElement(By.xpath("//main[@id='maincontent']/div[4]/div/div[3]/div/ul/li/button"))));*/
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//main[@id='maincontent']/div[4]/div/div[3]/div/ul/li/button")).click();
		  System.out.println("Checkout successfully completed");
		  Reporter.log("Checkout successfully completed");
	  }
	}


