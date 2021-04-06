package org.blaze.pojo;

import org.blaze.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{
	
	public HomePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="fromPort")
	private WebElement fromPort;
	
	@FindBy(name="toPort")
	private WebElement toPort;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;

	public WebElement getFromPort() {
		return fromPort;
	}

	public void setFromPort(WebElement fromPort) {
		this.fromPort = fromPort;
	}

	public WebElement getToPort() {
		return toPort;
	}

	public void setToPort(WebElement toPort) {
		this.toPort = toPort;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	


}

