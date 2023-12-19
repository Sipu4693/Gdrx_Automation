package com.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.utility.Base;



public class Add_to_cart extends Base
{
	
    public static void AddToCart() throws Exception
    {
         
    	driver.findElement(By.id("search")).sendKeys("Cenforce 100 mg");
    	Thread.sleep(2000);
    	driver.findElement(By.cssSelector("#search_mini_form > div.field.search > div > div > div.input-wrapper > div > div > div.product-item-info-wrapper > div:nth-child(2) > a > span > span > img")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/main/div[3]/div/div[1]/div[2]/div[2]/form/div[1]/div/div/div/div/div[2]")).click();
    	Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,500)", "");
    	for(int i=1;i<=3;i++)
    	{
    	driver.findElement(By.xpath("/html/body/main/div[3]/div/div[1]/div[2]/div[2]/form/div[2]/div/div/div[1]/div/div/div/div[2]")).click();
    	 Thread.sleep(2000);
    	}
    	for(int i=1;i<=3;i++)
    	{
    	 driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div[2]/div/div/div[1]/div/div/div/div[1]")).click();
       	 Thread.sleep(2000);
    	}
    	driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
    	Thread.sleep(3000);
    	System.out.println("Add to cart ");
          }
         
}


