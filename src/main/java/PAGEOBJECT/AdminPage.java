package PAGEOBJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	

	public WebDriver ldriver;
	
	public AdminPage(WebDriver rdriver) {
		super();
		this.ldriver = rdriver;
	PageFactory.initElements( rdriver,this);
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement btnlogin;
	
	public void SetUsername(String uname) {
	txtemail.clear();
	txtemail.sendKeys(uname);
}
	
	public void Setpassword(String password) {
		txtpassword.clear();
		txtpassword.sendKeys(password);
	}	
	
	public void clickOnLogin() {
	btnlogin.click();
	}
	
}
