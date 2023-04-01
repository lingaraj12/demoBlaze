package com.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {
@FindBy(linkText="index.html")
private WebElement Home;

@FindBy(id="loginusername")
private WebElement username;

@FindBy(id="loginpassword")
private WebElement password;
		
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbutton;

	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logout;		
		
	@FindBy(xpath="//a[text()='Iphone 6 32gb']")
	private WebElement iphone6;	
		
	@FindBy(xpath="//td[text()='Iphone 6 32gb']")
	private WebElement iphonecart;	
		
	@FindBy(xpath="//a[text()='Add to cart']")
	private WebElement addtocart;	
	
	public WebElement getAddtocart() {
		return addtocart;
	}
	@FindBy(id="login2")
	private WebElement login;		
		
	@FindBy(id="nameofuser")
	private WebElement nameofuser;
	
	@FindBy(xpath="//a[text()='Cart']")
	private WebElement cart;
	
	
	
	
	//getters
	public WebElement getHome() {
		return Home;
	}
	public void setHome(WebElement home) {
		Home = home;
	}
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
	public WebElement getLogout() {
		return logout;
	}
	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	public WebElement getIphone6() {
		return iphone6;
	}
	public void setIphone6(WebElement iphone6) {
		this.iphone6 = iphone6;
	}
	public WebElement getIphonecart() {
		return iphonecart;
	}
	public void setIphonecart(WebElement iphonecart) {
		this.iphonecart = iphonecart;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	public WebElement getNameofuser() {
		return nameofuser;
	}
	public void setNameofuser(WebElement nameofuser) {
		this.nameofuser = nameofuser;
	}
	public WebElement getCart() {
		return cart;
	}
	public void setCart(WebElement cart) {
		this.cart = cart;
	}

	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


