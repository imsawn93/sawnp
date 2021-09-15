package sawnp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class n {
	
	//WebDriver driver;
	
	
	public n (WebDriver driver) {
		
	//this.driver = driver;
		

	PageFactory.initElements(driver, this);
		
	}

	
	
	@FindBy (xpath="//input[@id='fromCity']")
	private WebElement roundtrip;



	public WebElement getRoundtrip() {
		return roundtrip;
	}



	
	
	//public WebElement roundtrip() {
	//return roundtrip;}
}
