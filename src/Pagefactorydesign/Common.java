package Pagefactorydesign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Common {
	@FindBy(xpath="//img[@class='logoutImg']")
	private WebElement LoginImg;

	public WebElement getLoginImg() {
		return LoginImg;
	}

}
