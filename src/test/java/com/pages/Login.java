package com.pages;

	import org.openqa.selenium.By;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

    import com.utility.Base;


	public class Login extends Base
	 {
	  /* public static String Email = "abcd123@gmail.com";
	   public static String Password = "Admin@1234";*/
	   
	   @Test
	   public static void Login(String Email,String Password) throws Exception
	   {
		   driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[2]/div[3]/ul/li[1]/a")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.id("email")).sendKeys(Email);
		   Thread.sleep(2000);
		   driver.findElement(By.id("pass")).sendKeys(Password);
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		   Thread.sleep(3000);
		   Reporter.log("Login Successfully");
		   
	   }
	 }


