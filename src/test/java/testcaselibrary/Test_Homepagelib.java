package testcaselibrary;

import org.testng.annotations.Test;

import pageobjectlibrary.Repo_Homepage;
import testbaselibrary.Test_BasePagelib;

public class Test_Homepagelib extends Test_BasePagelib{

	@Test
	public void homepage() throws InterruptedException {
		
		Repo_Homepage hp1=new Repo_Homepage(driver);
		
		hp1.Test_Explore();
		Thread.sleep(2000);
		hp1.Test_Explore1();
		hp1.Test_Explore2();
		hp1.Test_Explore3();
		hp1.Test_Explore4();
		
		hp1.Aboutezen();
		hp1.Test_Explore4();
		hp1.contactus();
		hp1.Test_Explore4();
		hp1.careers();
		hp1.Test_Explore4();
		hp1.LOCATION();
		hp1.Test_Explore4();
		hp1.PRIVACYPOLICY();
		hp1.Test_Explore4();
		hp1.TERMSANDCONDITIONS();
		
	}
}
