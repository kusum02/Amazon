package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;



public class HomePage {
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement searchBTN;
	
	@FindBy(id="nav-link-shopall")
	private WebElement Dropdown;
	
	@FindBy(xpath="//span[.='TV, Appliances, Electronics']")
	private WebElement DropdownOpt;
	
	@FindBy(xpath="//span[.='Headphones']")
	private WebElement Headphones;
	
	@FindBy(xpath="//span[@class='nav-line-3']")
	private WebElement SignIn; 
	
	@FindBy(xpath="//span[.='Hi PARASARAN']")
	private WebElement AfterSignIn;
	
	@FindBy(xpath="//span[@class='nav-line-3']")
	private WebElement SignInhover;
	
	@FindBy(xpath="//span[.='Not PARASARAN? Sign Out']")
	private WebElement Signoutlink;
	
public HomePage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
	
}

public void enterSearchBox(String se)
 {
	 searchBox.sendKeys(se);
	 
 }
 
public void clicksearchBTN(){
	searchBTN.click();
}

public void hoverMenu(WebDriver driver){
	Actions actions=new Actions(driver);
	actions.moveToElement(Dropdown).perform();
}

public void hoverOption(WebDriver driver){
	Actions actions=new Actions(driver);
	actions.moveToElement(DropdownOpt).perform();
}

public void clickOption(){
	Headphones.click();
}

public void clickSignin(){
	SignIn.click();
}

public void verifySignIn(WebDriver driver,long time){
	
	WebDriverWait wait=new WebDriverWait(driver,time);
	try{
		wait.until(ExpectedConditions.visibilityOf(AfterSignIn));
		Reporter.log("PASS:SignIn Successful", true);
	}
	catch(Exception e){
		Reporter.log("FAIL: SignIn Unsuccessful", true);
	    Assert.fail();
	}
		
	}
public void hoverSignIn(WebDriver driver){
	Actions actions=new Actions(driver);
	actions.moveToElement(SignInhover).perform();
}

public void clickSignOut(){
	Signoutlink.click();
}
	





 
}

 
 
	 
