package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.HeadPhonePage;
import pom.HomePage;
import pom.SonyMDRPage;

public class SonyMDRPageDisplay extends BaseTest {
	
	@Test(priority=3)
	public void testSonyMDRPageDisplay(){
		HomePage h2=new HomePage(driver);
		h2.hoverMenu(driver);
		h2.hoverOption(driver);
		h2.clickOption();
		HeadPhonePage hp1=new HeadPhonePage(driver);
		hp1.clickSonyMDR(driver);
		SonyMDRPage sonymdr=new SonyMDRPage(driver);
		sonymdr.verifySonyMDRPage(driver, 10);
	}
	

}
