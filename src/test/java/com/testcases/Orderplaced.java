package com.testcases;

import org.testng.annotations.Test;

import com.pages.Add_to_cart;
import com.pages.Checkout;
import com.pages.Login;
import com.pages.Medical;
import com.pages.Payment;
import com.pages.Shipping;
import com.utility.Base;

public class Orderplaced extends Base
{
	@Test
	public static void orderplaced ()throws Exception 
	{
	driver.navigate().to("https://www.goodrxmedicine.com/");
	Login.Login("sipu.nayak@moretasks.com","Admin@1234");
	Add_to_cart.AddToCart();
	Checkout.checkout();
	Shipping.Address();
	Medical.Proceed_To_Pay();
	Payment.Select_pay_Mode();
	
	}
}
