package testcaselibrary;

import org.testng.annotations.Test;

import pageobjectlibrary.Repo_whatweare;
import testbaselibrary.Test_BasePagelib;

public class Test_whatwearelib extends Test_BasePagelib{
	@Test
	public void whatweare() throws InterruptedException {
		Repo_whatweare wwr=new Repo_whatweare(driver);
		wwr.whoweare();
		
	
		wwr.corporate();
		
		wwr.AwardsRecognitions();
	
		wwr.Ourpatners();
		
		wwr.LeadershipGovernance();

	
	}

}
