package pageobjectlibrary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testpagedirectory.TestBaseconstructor;

public class Repo_Homepage extends TestBaseconstructor{

	public Repo_Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//declaration
	
	@FindBy(xpath="(//span[text()='Explore'])[1]")
	WebElement Explore;
	
	
	public void Test_Explore() throws InterruptedException {
		
		wlib.scrollAction(driver);

	}
	
	
   @FindBy(xpath="(//div[@class='elementor-flip-box__layer elementor-flip-box__back']//div)[1]")
   WebElement Explore1;
	public void Test_Explore1() throws InterruptedException {
		
		wlib.scrollAction(driver, Explore1);

	}
	
   
   
   @FindBy(xpath="(//div[@class='elementor-flip-box__layer elementor-flip-box__back']//div)[3]")
   
   WebElement Explore2;
  	public void Test_Explore2() throws InterruptedException {
  		
  		wlib.mouseHoverOn(driver, Explore2);

  	}
   
   
   @FindBy(xpath="(//div[@class='elementor-flip-box__layer__inner']//h3)[3]")
   WebElement Explore3;
 	public void Test_Explore3() throws InterruptedException {
 		
 		wlib.mouseHoverOn(driver, Explore3);

 	}
 	
 	
 	 	public void Test_Explore4() throws InterruptedException {
 	 		
 	 		wlib.scrollAction02(driver);

 	 	}
 	 	
 	 	@FindBy(xpath="(//a[@class='elementor-item'])[1]")
 	   WebElement Aboutezen;
 	 	public void Aboutezen() throws InterruptedException {
 	 		
 	 		wlib.actionclick(driver, Aboutezen);

 	 	}
 	 	
 	 	@FindBy(xpath="(//a[@class='elementor-item'])[2]")
 	   WebElement contactus;
 	 	public void contactus() throws InterruptedException {
 	 		
 	 		wlib.actionclick(driver, contactus);

 	 	}
 	 	
 	 	@FindBy(xpath="(//a[@class='elementor-item'])[3]")
 	   WebElement careers;
 	 	public void careers() throws InterruptedException {
 	 		
 	 		wlib.actionclick(driver, careers);

 	 	}
 	 	
 	 	
 	 	@FindBy(xpath="(//a[text()='LOCATION'])[1]")
 	   WebElement LOCATION;
 	 	public void LOCATION() throws InterruptedException {
 	 		
 	 		wlib.mouseHoverOn(driver, LOCATION);

 	 	}
 	 	
 	 	
 	 	@FindBy(xpath="(//a[text()='PRIVACY POLICY'])[1]")
 	   WebElement PRIVACYPOLICY;
 	 	public void PRIVACYPOLICY() throws InterruptedException {
 	 		
 	 		wlib.mouseHoverOn(driver, PRIVACYPOLICY);

 	 	}
 	 	
 	 	
 	 	@FindBy(xpath="(//a[text()='TERMS AND CONDITIONS'])[1]")
 	   WebElement TERMSANDCONDITIONS;
 	 	public void TERMSANDCONDITIONS() throws InterruptedException {
 	 		
 	 		wlib.mouseHoverOn(driver, TERMSANDCONDITIONS);

 	 	}	 									
}
  
	
	
							
							


