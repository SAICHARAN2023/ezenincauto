package pageobjectlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testpagedirectory.TestBaseconstructor;

public class Repo_whatweserve extends TestBaseconstructor{
	
	public Repo_whatweserve(WebDriver driver) {

		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="(//span[text()='Who We Serve'])[1]")
	WebElement whoweserve;
	
	public void whoweserve() {
		wlib.actionclick(driver, whoweserve);
	}
	
	@FindBy(xpath="//li[@id='menu-item-2430']/a[1]/span[1]/span[1]")
	WebElement medtech;
	
	public void medtech() {
		wlib.mouseHoverOn2(driver, medtech);
	}
	
	@FindBy(xpath="(//span[text()='Digital Health'])[1]")
	WebElement DigitalHealth;
	
	public void DigitalHealth() {
		wlib.mouseHoverOn(driver, DigitalHealth);
	}
	
	@FindBy(xpath="(//span[text()='Engineering Services'])[1]")
	WebElement engservice;
	
	public void engservice() {
		wlib.mouseHoverOn(driver, engservice);
	}
	
	
	@FindBy(xpath="(//span[text()='Strategic Engineering Services'])[1]")
	WebElement strengservice;
	
	public void  strengservice() {
		wlib.mouseHoverOn(driver, strengservice);
	}
	
	
	@FindBy(xpath="(//span[text()='PDM Services'])[1]")
	WebElement  pdmservice;
	
	public void  pdmservice() {
		wlib.mouseHoverOn(driver, pdmservice);
	}
	
	
	@FindBy(xpath="(//span[text()='PLM Services'])[1]")
	WebElement plmservice;
	
	public void plmservice() {
		wlib.mouseHoverOn(driver, plmservice);
	}
	
	
	@FindBy(xpath="(//span[text()='QMS Services'])[1]")
	WebElement qmsservice;
	
	public void qmsservice() {
		wlib.mouseHoverOn(driver, qmsservice);
	}
	
	
	@FindBy(xpath="(//span[text()='Labeling'])[1]")
	WebElement Labeling;
	
	public void Labeling() {
		wlib.mouseHoverOn(driver, Labeling);
	}
	
	
	@FindBy(xpath="(//span[text()='Biotech'])[1]")
	WebElement Biotech;
	
	public void Biotech() {
		wlib.mouseHoverOn2(driver, Biotech);
	}
	
	
	
	@FindBy(xpath="(//span[text()='Digital Health'])[2]")
	WebElement digitalhealth02;
	
	public void digitalhealth02() {
		wlib.mouseHoverOn(driver,digitalhealth02);
	}
	
	
	@FindBy(xpath="(//span[text()='TMF Services'])[1]")
	WebElement TMFSERVICE02;
	
	public void Tmfservice02() {
		wlib.mouseHoverOn(driver, TMFSERVICE02);
	}
	
	
	@FindBy(xpath="(//span[text()='QMS Services'])[2]")
	WebElement qmsservice02;
	
	public void qmsservice02() {
		wlib.mouseHoverOn(driver, qmsservice02);
	}
	
	
	@FindBy(xpath="(//span[text()='Provider'])[1]")
	WebElement provider03;
	
	public void provider03() {
		wlib.mouseHoverOn(driver, provider03);
	}
	
	
	@FindBy(xpath="(//span[text()='Epic Services'])[1]")
	WebElement epicservices;
	
	public void epicservices03() {
		wlib.mouseHoverOn(driver, epicservices);
	}
	
	
	
	@FindBy(xpath="(//span[text()='CERNER Services'])[1]")
	WebElement cernerservice;
	
	public void cernerservice() {
		wlib.mouseHoverOn(driver, cernerservice);
	}
	
	
	
	@FindBy(xpath="(//span[text()='Revenue Cycle Management'])[1]")
	WebElement RevenueCycleManagement;
	
	public void RevenueCycleManagement03() {
		wlib.mouseHoverOn(driver,  RevenueCycleManagement);
	}
	
	
			@FindBy(xpath="(//span[text()='Healthtech'])[1]")
			WebElement Healthtech;
			
			public void Healthtech03() {
				wlib.mouseHoverOn2(driver,  Healthtech);
			}
	
}


