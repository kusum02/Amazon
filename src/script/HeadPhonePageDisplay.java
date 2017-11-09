package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.HeadPhonePage;
import pom.HomePage;

public class HeadPhonePageDisplay extends BaseTest  {
	
	@Test(priority=2)
	public void testHeadphonePageDisplay(){
		HomePage h1=new HomePage(driver);
		h1.hoverMenu(driver);
		h1.hoverOption(driver);
		h1.clickOption();
		HeadPhonePage hp=new HeadPhonePage(driver);
		hp.verifyHeadPhonePage(driver);
	}
		
	

}
