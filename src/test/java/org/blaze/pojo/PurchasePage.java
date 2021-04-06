package org.blaze.pojo;

import org.blaze.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage extends BaseClass{
	public PurchasePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputName")
	private WebElement name;
	
	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="zipCode")
	private WebElement zip;
	
	@FindBy(id="cardType")
	private WebElement ctype;
	
	@FindBy(id="creditCardNumber")
	private WebElement ccnum;
	
	@FindBy(id="creditCardMonth")
	private WebElement ccmonth;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getZip() {
		return zip;
	}

	public void setZip(WebElement zip) {
		this.zip = zip;
	}

	public WebElement getCtype() {
		return ctype;
	}

	public void setCtype(WebElement ctype) {
		this.ctype = ctype;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public void setCcnum(WebElement ccnum) {
		this.ccnum = ccnum;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public void setCcmonth(WebElement ccmonth) {
		this.ccmonth = ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public void setCcyear(WebElement ccyear) {
		this.ccyear = ccyear;
	}

	public WebElement getNcard() {
		return ncard;
	}

	public void setNcard(WebElement ncard) {
		this.ncard = ncard;
	}

	@FindBy(id="creditCardYear")
	private WebElement ccyear;
	
	@FindBy(id="nameOnCard")
	private WebElement ncard;

}
