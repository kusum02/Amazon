package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class SignInPage {
	
	@FindBy(id="ap_email")
	private WebElement Emailtxtbox;
	
	@FindBy(id="ap_password")
	private WebElement Passwdtxtbox;
	
	@FindBy(id="signInSubmit")
	private WebElement loginBTN;
	
	@FindBy(xpath="//h1[@class='a-spacing-small']")
	private WebElement Logintxt;
	
public SignInPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void enteremail(String email){
	Emailtxtbox.sendKeys(email);
}

public void enterpwd(String pwd){
	Passwdtxtbox.sendKeys(pwd);
}

public void clickloginBTN(){
	loginBTN.click();
}

public void verifySignOut(WebDriver driver,long time){
	WebDriverWait wait=new WebDriverWait(driver,time);
	try{
		wait.until(ExpectedConditions.visibilityOf(Logintxt));
		Reporter.log("PASS:Sign In page is displayed", true);
	}
	catch(Exception e){
		Reporter.log("FAIL:Sign In page is not displayed", true);
		Assert.fail();
	}
}

}
