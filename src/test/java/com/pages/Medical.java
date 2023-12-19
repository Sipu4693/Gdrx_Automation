package com.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
	import org.testng.annotations.Test;
    import com.utility.Base;



	public class Medical extends Base 
	{ 
	  
	  public static void Proceed_To_Pay() throws Exception
	  {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	  	   js.executeScript("window.scrollBy(0,440)", "");
	  	  // Thread.sleep(1000);
	  	 //  driver.findElement(By.cssSelector(".button > span > span")).click();
	  	 WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shipping-new-address-form\"]/div[11]/div/button")));
		  Thread.sleep(2000);
		  Reporter.log("Medical condition page has been filled ");
	  }
	}



