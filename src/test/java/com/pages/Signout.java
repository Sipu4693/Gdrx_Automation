package com.pages;


import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.testng.Reporter;

import com.utility.Base;






public class Signout extends Base
{
    
	public static void Logout() throws Exception
	    {
    	    driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/a/img")).click();
    	    Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[3]/ul/li[2]")).click();
	        Thread.sleep(3000);
	        System.out.println("Signout successfully completed");
	        Reporter.log("Signout successfully completed");
	     //   Log.info("Signout successfully completed");
	    
	    }

 }




