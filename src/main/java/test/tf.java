package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;



import sawnp.nn;

public class tf {
	
	static nn obi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "/Users/ashrafhossain/Downloads/92/chromedriver");
		WebDriver browser = new ChromeDriver();
		//going to website
		
		
		browser.get("https://parabank.parasoft.com/parabank/index.htm");
		obi=PageFactory.initElements(browser, nn.class);
		//n home = new n(browser);
		
		//home.roundtrip.click();

		
		obi.getUsername();

	}

}
