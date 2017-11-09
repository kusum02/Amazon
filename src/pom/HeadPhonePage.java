package pom;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class HeadPhonePage {
	
	@FindBy(xpath="//h1[.='Headphones']")
	private WebElement HeadphoneText;
	
	@FindBy(xpath="(//span[@id='dealTitle'])[4]")
	private WebElement SonyMDR;
	
public HeadPhonePage(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void verifyHeadPhonePage(WebDriver driver){
	WebDriverWait wait=new WebDriverWait(driver,10);
	try{
		wait.until(ExpectedConditions.visibilityOf(HeadphoneText));
		Reporter.log("PASS:Headphone page is displayed", true);
	}
	catch(Exception e){
		Reporter.log("FAIL:Headphone page is not displayed", true);
		Assert.fail();
	}
}

public void clickSonyMDR(WebDriver driver){
	SonyMDR.click();
	Set<String> allWHS = driver.getWindowHandles();
	for(String wh:allWHS){
		driver.switchTo().window(wh);
	}
}

}
