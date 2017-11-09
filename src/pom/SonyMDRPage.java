package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class SonyMDRPage {
	
	@FindBy(id="productTitle")
	private WebElement SonyMDRTitle;
	
public SonyMDRPage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void verifySonyMDRPage(WebDriver driver, long time){
	WebDriverWait wait=new WebDriverWait(driver,time);
	try{
		wait.until(ExpectedConditions.visibilityOf(SonyMDRTitle));
		Reporter.log("PASS:Sony MDR Page is displayed", true);
	}
	catch(Exception e){
		Reporter.log("FAIL:Sony MDR Page is NOT displayed", true);
		Assert.fail();
	}
}

}
