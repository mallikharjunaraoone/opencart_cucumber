package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageSwagLabs extends BasePage {
	
	public LoginPageSwagLabs(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement txtusername;

	@FindBy(xpath = "//input[@id='password']")
	WebElement txtswagpassword;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement btnlogin;

public void setUsername(String user) {
	txtusername.sendKeys(user);
}

public void setPassword(String pwd) {
	txtswagpassword.sendKeys(pwd);
}
public void clickswaglogin() {
	btnlogin.click();
}
}