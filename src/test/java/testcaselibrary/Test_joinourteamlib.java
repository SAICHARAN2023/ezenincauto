package testcaselibrary;

import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.Test;

import pageobjectlibrary.Repo_joinourTeam;
import testbaselibrary.Test_BasePagelib;

public class Test_joinourteamlib extends Test_BasePagelib{

	@Test
	public void joinourteam() throws InterruptedException, IOException {
		Repo_joinourTeam jot=new Repo_joinourTeam(driver);
		
		jot.joinourteam();
		jot.careers();
		Thread.sleep(2000);
		jot.positions();
		Thread.sleep(2000);
		jot.requirements();
		Thread.sleep(2000);
		jot.contactform();
		Thread.sleep(2000);
		HashMap<String,String>  data=ez1.AMS_MAPDataManager1();
		String U1=data.get("N");
		String U2=data.get("E");
		String U3=data.get("C");
		String U4=data.get("P");
		String U5=data.get("A");
		String U6=data.get("R");
		jot.contactname(U1);
		jot.contactemail(U2);
		jot.contactphone(U3);
		jot.contactposition(U4);
		jot.contactmsg(U5);
		jot.contactresume(U6);
		jot.contactsubmit();
	}
}
