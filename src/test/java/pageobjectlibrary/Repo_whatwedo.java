package pageobjectlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testpagedirectory.TestBaseconstructor;

public class Repo_whatwedo extends TestBaseconstructor{

	public Repo_whatwedo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@FindBy(xpath="(//span[text()='What We Do'])[1]")
	WebElement whatwedo;
	
	public void whatwedo() {
		wlib.actionclick(driver, whatwedo);
	}
	
	@FindBy(xpath="(//li[contains(@class,'menu-item menu-item-type-post_type')]//a)[2]")
	WebElement Digital;
	
	public void Digital() {
		wlib.mouseHoverOn2(driver,Digital);
	}
	
	@FindBy(xpath="(//a[contains(@class,'gm-anchor gm-dropdown-toggle')])[3]")
	WebElement Data;
	
	public void Data() {
		wlib.mouseHoverOn2(driver, Data);
	}
	
	@FindBy(xpath="(//span[text()='Analytics'])[1]")
	WebElement Analysis;
	
	public void Analysis() {
		wlib.mouseHoverOn2(driver, Analysis);
	}
	
	
	@FindBy(xpath="(//span[text()='Data Science'])[1]")
	WebElement Datascience;
	
	public void Datascience() {
		wlib.mouseHoverOn(driver, Datascience);
	}
	
	
	@FindBy(xpath="(//span[text()='Cybersecurity'])[1]")
	WebElement  Cybersecurity;
	
	public void  Cybersecurity() {
		wlib.mouseHoverOn(driver,Cybersecurity);
	}
	
	
	@FindBy(xpath="//li[@id='menu-item-3665']/a[1]")
	WebElement cloud;
	
	public void cloud() {
		wlib.mouseHoverOn(driver, cloud);
	}
	
	
	@FindBy(xpath="(//span[text()='Enterprise IT'])[1]")
	WebElement Enterprise;
	
	public void Enterprise() {
		wlib.mouseHoverOn2(driver, Enterprise);
	}
	
	
	@FindBy(xpath="(//span[text()='Professional Services'])[1]")
	WebElement Professionalservice;
	
	public void Professionalservice() {
		wlib.mouseHoverOn2(driver, Professionalservice);
	}
	
	
	@FindBy(xpath="(//span[text()='IT Services'])[1]")
	WebElement Itservice;
	
	public void Itservice() {
		wlib.mouseHoverOn2(driver, Itservice);
	}
	
	
	
	@FindBy(xpath="(//span[text()='Data Strategy Modernization'])[1]")
	WebElement DataStrategyModernization;
	
	public void DataStrategyModernization() {
		wlib.mouseHoverOn2(driver,DataStrategyModernization);
	}
	
	
	
	
	//----------------------------------------************------------------
	
	
	
	@FindBy(xpath="(//span[text()='Cloud and Digital Applications'])[1]")
	WebElement CloudandDigitalApplications;
	
	public void CloudandDigitalApplications() {
		wlib.mouseHoverOn(driver, CloudandDigitalApplications);
	}
	
	
	@FindBy(xpath="(//span[text()='Digital Experience & Design'])[1]")
	WebElement DigitalExperienceDesign;
	
	public void DigitalExperienceDesign() {
		wlib.mouseHoverOn(driver, DigitalExperienceDesign);
	}
	
	
	@FindBy(xpath="(//span[text()='Management Consulting'])[1]")
	WebElement ManagementConsulting;
	
	public void  ManagementConsulting() {
		wlib.mouseHoverOn(driver,  ManagementConsulting);
	}
	
	
	@FindBy(xpath="(//span[text()='Digital Skills'])[1]")
	WebElement DigitalSkills;
	
	public void DigitalSkills() {
		wlib.mouseHoverOn(driver, DigitalSkills);
	}
	
	
	
	@FindBy(xpath="(//span[text()='Database Services'])[1]")
	WebElement DatabaseServices;
	
	public void DatabaseServices() {
		wlib.mouseHoverOn(driver, DatabaseServices);
	}
	
	
	
	@FindBy(xpath="(//span[text()='Data Mining'])[1]")
	WebElement DataMining;
	
	public void DataMining() {
		wlib.mouseHoverOn(driver,  DataMining);
	}
	
	
			@FindBy(xpath="(//span[text()='Data Warehousing'])[1]")
			WebElement DataWarehousing;
			
			public void DataWarehousing() {
				wlib.mouseHoverOn(driver,  DataWarehousing);
			}
			
			
			@FindBy(xpath="(//span[text()='Bi Analytics Reporting'])[1]")
			WebElement BiAnalyticsreport;
			
			public void BiAnalyticsreport() {
				wlib.mouseHoverOn(driver, BiAnalyticsreport);
			}
			
			@FindBy(xpath="(//span[text()='Data Science AI'])[1]")
			WebElement datascienceai;
			
			public void datascienceai() {
				wlib.mouseHoverOn2(driver, datascienceai);
			}
			
			@FindBy(xpath="(//span[text()='Digital experience'])[1]")
			WebElement Digitalexperience;
			
			public void Digitalexperience() {
				wlib.mouseHoverOn(driver, Digitalexperience);
			}
			
			@FindBy(xpath="(//span[text()='IoT – Internet of Things'])[1]")
			WebElement IotThings;
			
			public void eIotThing() {
				wlib.mouseHoverOn(driver, IotThings);
			}
			
			
			@FindBy(xpath="(//span[text()='Digital Technical Skills'])[1]")
			WebElement DigitalTechnicalSkills;
			
			public void  DigitalTechnicalSkills() {
				wlib.mouseHoverOn(driver, DigitalTechnicalSkills);
			}
			
			
			@FindBy(xpath="(//span[text()='Clients'])[1]")
			WebElement  Clients;
			
			public void  Clients() {
				wlib.mouseHoverOn(driver, Clients);
			}
			
			
			@FindBy(xpath="(//span[text()='IT Consulting Services'])[1]")
			WebElement ITConsulting;
			
			public void ITConsulting() {
				wlib.mouseHoverOn(driver, ITConsulting);
			}
			
			
			@FindBy(xpath="(//span[text()='AI Enabled Automation'])[1]")
			WebElement AIEnabled;
			
			public void AIEnabled() {
				wlib.mouseHoverOn(driver, AIEnabled);
			}
			
			
			@FindBy(xpath="(//span[text()='Enterprise Solutions'])[1]")
			WebElement EnterpriseSolutions;
			
			public void EnterpriseSolutions() {
				wlib.mouseHoverOn(driver, EnterpriseSolutions);
			}
			
			
			@FindBy(xpath="(//span[text()='Content Management'])[1]")
			WebElement ContentManagement;
			
			public void ContentManagement() {
				wlib.mouseHoverOn(driver, ContentManagement);
			}
			
			
			
			@FindBy(xpath="(//span[text()='Project Consulting'])[1]")
			WebElement ProjectConsulting;
			
			public void ProjectConsulting() {
				wlib.mouseHoverOn(driver,ProjectConsulting);
			}
			
			
			@FindBy(xpath="(//span[text()='Quality Testing'])[1]")
			WebElement QualityTesting;
			
			public void QualityTesting() {
				wlib.mouseHoverOn(driver, QualityTesting);
			}

}
