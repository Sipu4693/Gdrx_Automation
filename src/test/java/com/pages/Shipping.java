package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.utility.Base;


public class Shipping extends Base
{
   
    public static void Address() throws Exception
     {
    
     try
     {
   /* WebElement element = driver.findElement(By.xpath("//*[@id=\"customer-email\"]"));
    if(element.isDisplayed()==true) {
    element.sendKeys("sipu.nayak@moretasks.com");
    }*/
    
	//driver.findElement(By.xpath("//input[@id='customer-email']")).click();
	//Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='customer-email']")).sendKeys("sipu.nayak@moretasks.com");
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("Test");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("Test");
	Thread.sleep(2000);
	driver.findElement(By.name("street[0]")).sendKeys("Test");
	Thread.sleep(1000);
	driver.findElement(By.name("city")).sendKeys("Test");
	Thread.sleep(1000);
	driver.findElement(By.name("region_id")).click();
	Select st = new Select(driver.findElement(By.name("region_id")));
	st.selectByVisibleText("California");
	Thread.sleep(2000);
	driver.findElement(By.name("postcode")).sendKeys("53762");
	Thread.sleep(2000);
	driver.findElement(By.name("telephone")).sendKeys("9372388372");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//form/div[3]/div/button")).click();
	System.out.println("Shipping address has been updated");
	Reporter.log("Shipping address has been updated");
     }
	catch(Exception e)
	
	{
	//driver.findElement(By.xpath("//form/div[3]/div/button")).click();
	/*Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//form/div[3]/div/button"))).perform();
	Thread.sleep(2000);*/
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form/div[3]/div/button")));
	System.out.println("Shipping address has been updated");
	Reporter.log("Shipping address has been updated");
	}
 }
}



