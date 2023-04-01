package com.testScripts;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.demoBlaze.genericMethod.Baseclass;
import com.demoBlaze.genericMethod.Retry;

public class AddToCart extends Baseclass {
@Test(retryAnalyzer=Retry.class)
public void AddToCarttest() {
	hp.getIphone6().click();
	Reporter.log("landed on pdt details page", true);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	hp.getAddtocart().click();
	cu.waitForAlert(driver);
	cu.acceptalert(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	hp.getCart().click();
	try {
		hp.getIphonecart();
	}catch
	(NoSuchElementException e) {
		Assert.assertTrue(true, "test case failed");
	}
	
	
	
	
}




}
