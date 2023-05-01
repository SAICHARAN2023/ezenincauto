package testpagedirectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.ezen_webdrivergenericdir;

public class TestBaseconstructor {
	
	public WebDriver driver;
	
	public TestBaseconstructor(WebDriver driver) {
	
		  this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	public ezen_webdrivergenericdir wlib=new ezen_webdrivergenericdir();
}
