package pageobjectlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testpagedirectory.TestBaseconstructor;

public class Repo_whatweare  extends TestBaseconstructor
{
	public Repo_whatweare(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@FindBy(xpath="(//span[text()='Who We Are'])[1]")
	WebElement whoweare;
	
	public void whoweare() {
		wlib.actionclick(driver, whoweare);
	}
	
	@FindBy(xpath="(//span[text()='Corporate'])[1]")
	WebElement corporate;
	
	public void corporate() {
		wlib.actionclick(driver, corporate);
	}
	
	@FindBy(xpath="(//span[text()='Leadership & Governance'])[1]")
	WebElement LeadershipGovernance;
	
	public void LeadershipGovernance() {
		wlib.actionclick(driver, LeadershipGovernance);
	}
	
	
	@FindBy(xpath="(//span[text()='Awards & Recognitions'])[1]")
	WebElement AwardsRecognitions;
	
	public void  AwardsRecognitions() {
		wlib.actionclick(driver,  AwardsRecognitions);
	}
	
	@FindBy(xpath="(//span[text()='Our Partners'])[1]")
	WebElement Ourpatners;
	
	public void   Ourpatners() {
		wlib.actionclick(driver,   Ourpatners);
	}
	
	
	//bussiness logic:
	

}


