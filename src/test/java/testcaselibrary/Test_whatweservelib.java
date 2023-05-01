package testcaselibrary;


import org.testng.annotations.Test;

import pageobjectlibrary.Repo_whatweserve;
import testbaselibrary.Test_BasePagelib;

public class Test_whatweservelib extends Test_BasePagelib{

	@Test
	public void whatweserve() throws InterruptedException {
		
		Repo_whatweserve wws=new Repo_whatweserve(driver);
		wws.whoweserve();
		Thread.sleep(1000);
		wws.medtech();
		Thread.sleep(1000);
		wws.DigitalHealth();
		Thread.sleep(1000);
		wws.whoweserve();
		Thread.sleep(1000);
		wws.medtech();
		Thread.sleep(1000);
		wws.engservice();
		Thread.sleep(1000);
		wws.whoweserve();
		Thread.sleep(1000);
		wws.medtech();
		Thread.sleep(1000);
		wws.strengservice();
		Thread.sleep(1000);
		wws.whoweserve();
		Thread.sleep(1000);
		wws.medtech();
		Thread.sleep(1000);
		wws.pdmservice();
		Thread.sleep(1000);
		wws.whoweserve();
		Thread.sleep(1000);
		wws.medtech();
		Thread.sleep(1000);
		wws.plmservice();
		wws.whoweserve();
		wws.medtech();
		wws.qmsservice();
		wws.whoweserve();
		wws.medtech();
		wws.Labeling();
		wws.whoweserve();
		wws.Biotech();
		wws.digitalhealth02();
		wws.whoweserve();
		wws.Biotech();
		wws.qmsservice02();
		wws.whoweserve();
		wws.Biotech();
		wws.Tmfservice02();
		wws.whoweserve();
		wws.Healthtech03();
		wws.epicservices03();
		wws.whoweserve();
		wws.Healthtech03();
		wws.provider03();
		wws.whoweserve();
		wws.Healthtech03();
		wws.RevenueCycleManagement03();
		wws.whoweserve();
		wws.Healthtech03();
		wws.cernerservice();
		
		
		
		
	}
}
