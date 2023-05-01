package pageobjectlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testpagedirectory.TestBaseconstructor;

public class Repo_joinourTeam extends  TestBaseconstructor{

	public Repo_joinourTeam(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="(//span[text()='Join Our Team'])[1]")
	WebElement joinourteam;
	
	public void joinourteam() {
		wlib.actionclick(driver, joinourteam);
	}
	
	@FindBy(xpath="(//span[text()='Careers'])[1]")
	WebElement careers;
	
	public void careers() {
		wlib.actionclick(driver, careers);
	}
	
	@FindBy(xpath="(//a[@class='elementor-item elementor-item-anchor'])[1]")
	WebElement positions;
	
	public void positions() {
		wlib.actionclick(driver, positions);
	}
	
	
	@FindBy(xpath="(//a[@class='elementor-item elementor-item-anchor'])[2]")
	WebElement requirements;
	
	public void  requirements() {
		wlib.actionclick(driver,  requirements);
	}
	
	@FindBy(xpath="(//a[@class='elementor-item elementor-item-anchor'])[3]")
	WebElement contactform;
	
	public void   contactform() {
		wlib.actionclick(driver,   contactform);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement contactname;
	
	public void   contactname(String name) {
		contactname.sendKeys(name);
	}
	
	@FindBy(xpath="	//input[@placeholder='Email']")
	WebElement contactemail;
	
	public void   contactemail(String email) {
		 contactemail.sendKeys(email);
	}
	
	
	@FindBy(xpath="(//div[contains(@class,'elementor-field-type-text elementor-field-group')]//input)[2]")
	WebElement contactphone;
	
	public void   contactphone(String phone) {
	 contactphone.sendKeys(phone);
	}
	
	
	@FindBy(xpath="//select[@class='elementor-field-textual elementor-size-sm']")
	WebElement contactposition;
	
	public void   contactposition(String value) {
	 wlib.handleDropDown(contactposition, value);
	}
	
	
	@FindBy(xpath="//textarea[contains(@class,'elementor-field-textual elementor-field')]")
	WebElement contactmsg;
	
	public void   contactmsg(String msg) {
		contactmsg.sendKeys(msg);
	}
	
	@FindBy(xpath="//div[contains(@class,'elementor-field-type-upload elementor-field-group')]//input[1]")
	WebElement contactresume;
	
	public void   contactresume(String resumepath) {
		contactresume.sendKeys(resumepath);
	}
	
	@FindBy(xpath="(//div[contains(@class,'elementor-field-group elementor-column')]//button)[1]")
	WebElement contactsubmit;
	
	public void   contactsubmit() {
		wlib.actionclick(driver,  contactsubmit);
	}

}
