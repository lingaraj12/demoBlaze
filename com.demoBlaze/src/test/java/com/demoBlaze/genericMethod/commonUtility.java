package com.demoBlaze.genericMethod;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class commonUtility {
WebDriverWait wait;
public void acceptalert(WebDriver driver) {
Alert alt=driver.switchTo().alert();
alt.accept();
}
public void waitForAlert(WebDriver driver) {
	wait=new WebDriverWait (Baseclass.driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.alertIsPresent());
}

public void select(WebElement ele) {
	Select sel=new Select(ele);
}

public void actions(WebDriver driver) {
	Actions act=new Actions(driver);
}

}
	
	
	
	
	
	
	
	
	

