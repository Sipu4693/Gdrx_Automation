package com.testcases;

import org.testng.annotations.Test;

import com.pages.Add_to_cart;
import com.pages.Checkout;
import com.pages.Login;
import com.utility.Base;

public class Productcheckout extends Base
{
	@Test
	public void checkout()throws Exception
	{
	driver.navigate().to("https://www.goodrxmedicine.com/");
	Login.Login("sipu.nayak@moretasks.com","Admin@1234");
	Add_to_cart.AddToCart();
	Checkout.checkout();
	}
}
