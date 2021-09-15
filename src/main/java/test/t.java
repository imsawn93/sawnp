package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import sawnp.n;

public class t {

	static n obi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "/Users/ashrafhossain/Downloads/92/chromedriver");
		WebDriver browser = new ChromeDriver();
		//going to website
		
		
		browser.get("https://www.makemytrip.com/?ccde=us");
		obi=PageFactory.initElements(browser, n.class);
		//n home = new n(browser);
		
		//home.roundtrip.click();

		obi.getRoundtrip().click();
		
		
	}
	
	
	

}
