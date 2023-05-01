package testbaselibrary;

import java.io.IOException;
import java.util.HashMap;
import java.util.ResourceBundle;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import genericlibrary.ezen_hashmapdir;


public class Test_BasePagelib {

	
	public static WebDriver driver;
	public ResourceBundle rb;
	public static Logger logger;
	
    public  ezen_hashmapdir  ez1=new  ezen_hashmapdir();
	
	@BeforeClass
	@Parameters({"browser"})
	public void Browsersetup(String br) throws InterruptedException, IOException {
		logger=LogManager.getLogger(this.getClass());
			logger.info("****** start the browser *********");
		rb=ResourceBundle.getBundle("config");
		
		if(br.equals("chrome")) {
		
			   driver=new ChromeDriver();
			   
		}else if((br.equals("fire")) ) {
	        
			driver=new FirefoxDriver();
		}
		
        else if((br.equals("edge")) ) {
	        
			driver=new EdgeDriver();
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			HashMap<String,String>  data=ez1.AMS_MAPDataManager();
			String U=data.get("URL");
			driver.get(U);
			logger.info("***browser setup****");
			
		
			
		 
			
		
	

			
			
			
		}
	
	
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
		logger.info("***browser quit****");
	}
	
	
	

}
