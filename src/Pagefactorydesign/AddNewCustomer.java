package Pagefactorydesign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomer {
	@FindBy(xpath="//input[@name='name']")
	private WebElement NameLink;
	
	
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	private WebElement CreatCustBtn;


	public WebElement getNameLink() {
		return NameLink;
	}


	public WebElement getCreatCustBtn() {
		return CreatCustBtn;
	}


}
