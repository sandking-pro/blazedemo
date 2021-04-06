package org.blaze.pojo;

import java.util.List;

import org.blaze.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservePage extends BaseClass{
	
	public ReservePage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class=\"table\"]//tbody//tr")
//	@FindBy(xpath="//table//thead//tr//th[contains(text(),\"Price\")]//parent::tr//parent::thead//following::tbody//tr")
//	@FindBy(xpath="//table")
	private List<WebElement> rtable;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement chooseFlight;

	public List<WebElement> getRtable() {
		return rtable;
	}

	public void setRtable(List<WebElement> rtable) {
		this.rtable = rtable;
	}

	public WebElement getChooseFlight() {
		return chooseFlight;
	}

	public void setChooseFlight(WebElement chooseFlight) {
		this.chooseFlight = chooseFlight;
	}
	
	

}
