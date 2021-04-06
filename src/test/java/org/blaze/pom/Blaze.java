package org.blaze.pom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.blaze.base.BaseClass;
import org.blaze.pojo.HomePage;
import org.blaze.pojo.PurchasePage;
import org.blaze.pojo.ReservePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Blaze extends BaseClass {
	
	@DataProvider(name="origins")
	public Object[][] getSrcdest(){
		return new Object[][] {{"Portland","London"}};
	}
	
	@DataProvider(name="userDetails")
	public Object[][] getUser(){
		return new Object[][] {{"Prakash","13 maariamman st","chennai","tamilnadu","600070","123335565665","amex","12","2021","Pakash Kanth"}};
	}

	@Parameters({"url"})
	@BeforeClass
	public void launch(String s) {
		getDriver();
		launchUrl(s);
	}
	
	@Test(dataProvider = "origins")
	public void tc0(String src, String dest) {
		HomePage hp = new HomePage();
		selectDropdown(hp.getFromPort(),src,"vt");
		selectDropdown(hp.getToPort(),dest,"vt");
		btnClick(hp.getSubmit());
	}
	
	@Test
	public void tc1() {
		ReservePage rp= new ReservePage();
		
//		rp.getRtable().findElement(By.xpath(".//thead//tr//th[contains(text(),\"Price\")]"));
//		System.out.println(rp.getRtable().findElement(By.xpath(".//thead//tr//th[contains(text(),\"Price\")]")).getText());
		List<Float> pList = new ArrayList<Float>();
		for (WebElement rEle : rp.getRtable()) {
			String price = rEle.findElement(By.xpath(".//td[6]")).getText().replace("$","" );
			pList.add(Float.parseFloat(price));
		}
		int minIndex = pList.indexOf(Collections.min(pList));
		
		System.out.println(rp.getRtable().get(minIndex).findElement(By.xpath("./td[2]")).getText());
		rp.getRtable().get(minIndex).findElement(By.xpath("./td[1]//input[@type=\"submit\"]")).click();
	}
	
	@Test(dataProvider = "userDetails")
	public void tc2(String name,String Addr,String cty,String state,String pincode,String ctype,String cnum,String mon,String yr,String nc) {
		PurchasePage pp = new PurchasePage();
		enterText(pp.getName(),name);

		
		
	}
	
	
} 
