package com.utility;

	import java.lang.reflect.Method;
	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.Assert;
	import org.testng.ITestContext;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Base {

	    public static RemoteWebDriver driver;
	    private String Status = "failed";

	    @BeforeMethod
	    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
	        String username = System.getenv("LT_USERNAME") == null ? "financemoretasks" : System.getenv("LT_USERNAME");
	        String authkey = System.getenv("LT_ACCESS_KEY") == null ? "bcSCc84Tl1YSxXzkA1yWMQnLMhzuSzWHOjgWJTHZfAidmIIk93" : System.getenv("LT_ACCESS_KEY");
	        ;
	        String hub = "@hub.lambdatest.com/wd/hub";

	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("platform", "Windows 11");
	        caps.setCapability("browserName", "chrome");
	        caps.setCapability("version", "latest");
	        caps.setCapability("build", "GDRX");
	        caps.setCapability( "network", true ) ;
	        caps.setCapability("name", m.getName() + " - " + this.getClass().getName());
	        caps.setCapability("plugin", "git-testng");

	        String[] Tags = new String[] { "Feature", "Falcon", "Severe" };
	        caps.setCapability("tags", Tags);

	        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);

	    }


	    @AfterMethod
	    public void tearDown() {
	        driver.executeScript("lambda-status=" + Status);
	        driver.quit();
	    }

	}



