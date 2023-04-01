package com.demoBlaze.genericMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Eventlist implements ITestListener{
	public void onTestFailure(ITestResult result) {
	File src=((TakesScreenshot)Baseclass.driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("ScreenShot/"+System.currentTimeMillis()+".png");
	try {
		FileUtils.copyFile(src, dest);
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	
	
	}

	
	}
