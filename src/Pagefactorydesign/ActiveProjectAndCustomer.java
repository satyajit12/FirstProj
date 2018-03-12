package Pagefactorydesign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCustomer {
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement AddCustBtn;
	
	
	
	@FindBy(xpath="//input[@value='Add New Project']")
	private WebElement AddprojBtn;

    @FindBy(xpath="//select[@name='recordsPerPage']")
    private WebElement SelectNumber;

	public WebElement getSelectNumber() {
	return SelectNumber;
}



	public WebElement getAddCustBtn() {
		return AddCustBtn;
	}



	public WebElement getAddprojBtn() {
		return AddprojBtn;
	}

}
