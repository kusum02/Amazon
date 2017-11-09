package script;



import org.testng.annotations.Test;

import generic.BaseTest;
import pom.HomePage;
import pom.ShoePage;

public class ShoePageDisplay extends BaseTest {
	
	@Test(priority=1)
	public void testShoePageDisplay(){
		
		HomePage h=new HomePage(driver);
		//Enter Shoes in search box
		h.enterSearchBox("Shoes");
		//click on Search
		h.clicksearchBTN();
		//verify Shoe page is displayed
		ShoePage s=new ShoePage(driver);
		s.verifyShoePageDisplay(driver);
	}

}
