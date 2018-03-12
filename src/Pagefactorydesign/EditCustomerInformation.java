package Pagefactorydesign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCustomerInformation {
	@FindBy(xpath="//td[contains(text(),'You')]/following-sibling::td[1]/span")
	private WebElement Customerverification;

	public WebElement getCustomerverification() {
		return Customerverification;
	}

}
