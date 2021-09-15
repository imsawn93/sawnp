package sawnp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class nn {
	
	
	
	public nn (WebDriver driver) {
	
	PageFactory.initElements(driver, this);
	
	

}
	

	@FindBy(xpath="//input[@type='text']")
	private WebElement username;


	public WebElement getUsername() {
		return username;
	}



	
	
	
	
}
