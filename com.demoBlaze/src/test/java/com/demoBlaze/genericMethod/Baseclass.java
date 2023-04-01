package com.demoBlaze.genericMethod;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.objectRepo.homePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public fileLib fl=new fileLib();
	public String paths="testdata/demoblaze.properties";
	public homePage hp;
	public commonUtility cu=new commonUtility();
	
	@BeforeTest
	public void configBT() throws IOException {
		if(fl.getDataFromProperties(paths, "browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
	
		hp=PageFactory.initElements(driver, homePage.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(fl.getDataFromProperties(paths,"url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@BeforeMethod
	public void configBM() throws IOException, InterruptedException {
	hp.getLogin().click();
	hp.getUsername().sendKeys(fl.getDataFromProperties(paths,"username"));
	hp.getPassword().sendKeys(fl.getDataFromProperties(paths,"password"));
	hp.getLoginbutton().click();
	Thread.sleep(4000);
	//Assert.assertTrue(hp.getNameofuser().getText().contains(fl.getDataFromProperties(paths,"username")));
	}
	@AfterMethod
	public void configAm() {
		//hp.getLogout().click();
	}
	@AfterTest
	public void configAt(){
		//driver.quit();
	
	}

}
