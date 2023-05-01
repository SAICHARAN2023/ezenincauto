package testcaselibrary;

import org.testng.annotations.Test;

import pageobjectlibrary.Repo_whatwedo;
import testbaselibrary.Test_BasePagelib;

public class Test_whatwedolib extends Test_BasePagelib{ 
	
	@Test
	public void whatwedo() {
	Repo_whatwedo wwd=new Repo_whatwedo(driver);
	wwd.whatwedo();
	wwd.Digital();
	wwd.CloudandDigitalApplications();
	//case-2
	wwd.whatwedo();
	wwd.Digital();
	wwd.DigitalExperienceDesign();
	
	//case-3
	wwd.whatwedo();
	wwd.Digital();
	wwd.ManagementConsulting();
	
	//case-4
	wwd.whatwedo();
	wwd.Digital();
	wwd.DigitalSkills();
	
	//case-5
	wwd.whatwedo();
	wwd.Data();
	wwd.DatabaseServices();
	
	//case-6
	wwd.whatwedo();
	wwd.Data();
	wwd.DataMining();
	
	//case-7
	wwd.whatwedo();
	wwd.Data();
	wwd.DataWarehousing();
	
	//case-8
	wwd.whatwedo();
	wwd.Data();
	wwd.DataStrategyModernization();
	wwd.BiAnalyticsreport();
	
	//case-9
	wwd.whatwedo();
	wwd.Data();
	wwd.DataStrategyModernization();
	wwd.BiAnalyticsreport();
	wwd.datascienceai();
	
	//case-10
	wwd.whatwedo();
	wwd.Data();
	wwd.DataStrategyModernization();
	wwd.BiAnalyticsreport();
	wwd.Digitalexperience();
	
	//case-11
	wwd.whatwedo();
	wwd.Analysis();
	wwd.eIotThing();
	
	//case-12
	
	wwd.whatwedo();
	wwd.Datascience();

	//case-13
	wwd.whatwedo();
	wwd.Cybersecurity();
	
	//case-14
	wwd.whatwedo();
	wwd.cloud();
	
	//case-15
	wwd.whatwedo();
	wwd.Enterprise();
	wwd.EnterpriseSolutions();
	
	//case-16
	wwd.whatwedo();
	wwd.Enterprise();
	wwd.ContentManagement();
	

	//case-17
	wwd.whatwedo();
	wwd.Enterprise();
	wwd.ProjectConsulting();
	

	//case-18
	wwd.whatwedo();
	wwd.Enterprise();
	wwd.QualityTesting();
	
	
	//case-19
	wwd.whatwedo();
	wwd.Professionalservice();
	wwd.DigitalTechnicalSkills();
	
	//case-20
	wwd.whatwedo();
	wwd.Itservice();
	wwd.ITConsulting();
	
	//case-21
	wwd.whatwedo();
	wwd.Itservice();
	wwd.AIEnabled();
	
	//case-22
	wwd.whatwedo();
	wwd.Clients();

}
}
