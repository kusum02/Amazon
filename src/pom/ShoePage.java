package pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ShoePage {
	
	@FindBy(linkText="Looking for Shoes?")
	private WebElement link;
	
public ShoePage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void verifyShoePageDisplay(WebDriver driver){
	WebDriverWait wait=new WebDriverWait(driver,10);
	try{
		wait.until(ExpectedConditions.visibilityOf(link));
		Reporter.log("PASS:Shoe page is displayed", true);
	}
	catch(Exception e){
		Reporter.log("FAIL:Shoe page is not displayed", true);
		Assert.fail();
		
	}
	
	
}
	


}
