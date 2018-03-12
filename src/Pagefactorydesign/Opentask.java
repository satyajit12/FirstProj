package Pagefactorydesign;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Opentask {
@FindBy(xpath="//a[text()='Projects & Customers']")
private WebElement projAndCustLink;
@FindBy(xpath="//a[text()='Reports']")
private WebElement ReportLink;

public WebElement getProjAndCustLink() {
	return projAndCustLink;
}
public WebElement getReportLink() {
	return ReportLink;
}



}


