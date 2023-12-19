package com.pages;

	import org.openqa.selenium.By;
	import org.testng.Reporter;
	import org.testng.annotations.Test;
    import com.utility.Base;

	public class Payment extends Base
	 {
	   @Test
	   public static void Select_pay_Mode() throws Exception
	   {
		   driver.findElement(By.xpath("//*[@id=\"checkmo\"]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"block-discount-heading\"]/span")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.name("discount_code")).sendKeys("gdrx15");
		   Thread.sleep(1000);
		// driver.findElement(By.xpath("/html/body/div[3]/main/div[3]/div/div[2]/div[3]/ol/li[4]/div/form/fieldset/div[5]/div[2]/form/div[2]/div/button/span/span")).click();
		   driver.findElement(By.cssSelector("#opc-sidebar > div.opc-block-summary > div.place-order.order-review-form.last > div > div > button")).click();
		   Thread.sleep(2000);		
		   System.out.println("Congratulations Your Order has been placed successfully");
		   Reporter.log("Congratulations Your Order has been placed successfully");
		   /*String OrderNo = driver.findElement(By.xpath("/html/body/main/div[3]/div/div[3]/div[2]/div[1]/div/div[2]/p[1]/a")).getText();
		   System.out.println("Your order number is :"+OrderNo);
		   Reporter.log(OrderNo);*/
	   }
		
	 }


