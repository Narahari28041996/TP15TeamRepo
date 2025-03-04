package domainname.appname.modulename.ObjectRepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import domainname.appname.modulename.BaseClass.BaseClass;

public class LoginPage extends BaseClass {

	WebDriver driver;
	LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement username;
	
	@FindBy(name="user_password")
	private WebElement password;
	
	@FindBy(id="submitButton")
	private WebElement submitbtn;
	
	public WebElement getusername() {
		return username;
	}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getsubmitbtn() {
		return submitbtn;
	
	}
	
}
