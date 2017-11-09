package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import pom.HomePage;
import pom.SignInPage;

public class VerifySignIn extends BaseTest {
	
	@Test(priority=4)
	public void testVerifySignIn(){
		HomePage h4=new HomePage(driver);
		h4.clickSignin();
		SignInPage s1=new SignInPage(driver);
		s1.enteremail("parasaran1990@gmail.com");
		s1.enterpwd("paras@90");
		s1.clickloginBTN();
		h4.verifySignIn(driver, 15);
	}

}
