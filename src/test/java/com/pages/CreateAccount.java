package com.pages;

	import org.apache.commons.logging.Log;
    import org.openqa.selenium.By;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

import com.utility.Base;



	public class CreateAccount extends Base
	 {
		//public static String Email = "abcd123@gmail.com";
		//public static String Password = "Admin@1234";
		@Test
	    public static void Signuppage(String Email , String Password) throws Exception
	   {
	      driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[3]/ul/li[2]/a")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.id("firstname")).sendKeys("test");
	      Thread.sleep(2000);
	      driver.findElement(By.id("lastname")).sendKeys("test");
	      Thread.sleep(2000);
	      driver.findElement(By.id("email_address")).sendKeys(Email);
	      Thread.sleep(2000);
	      driver.findElement(By.id("password")).sendKeys(Password);
	      Thread.sleep(3000);
	      driver.findElement(By.id("password-confirmation")).sendKeys(Password);
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
	      Thread.sleep(2000);
	    	  String URL = driver.getCurrentUrl();
	    	  Thread.sleep(2000);
	    	  System.out.println(URL);
	      if(URL == "https://www.goodrxmedicine.com/customer/account/" )
	      {
	      System.out.println("Signup successfully completed");
	    //  Log.info("Signup successfully completed");
	      Reporter.log("Signup successfully completed");
	      }
	      else
	      {
	    	  
	    	  System.out.println("signup failed");
	    	  Reporter.log("Signup Failed");
	    	  driver.close();
	    
	      }
	    }
	   
	  }
	 


