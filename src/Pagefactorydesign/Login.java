package Pagefactorydesign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	@FindBy(name="username")
	private WebElement UserNameEdit;

	@FindBy(name="pwd")
	private WebElement PassWordEdit;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtnEdit;

	public WebElement getUserNameEdit() {
		return UserNameEdit;
	}

	public WebElement getPassWordEdit() {
		return PassWordEdit;
	}

	public WebElement getLoginBtnEdit() {
		return loginBtnEdit;
	}


}
