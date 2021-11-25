package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[normalize-space()='Single']")
	public WebElement toggleSingle;
	
	//select[@title='Number of dependants']
	
	@FindBy(xpath = "//select[@title='Number of dependants']")
	public WebElement dropdownNumberOfDep;
	
	//(//label[@class="btn"])[3]

	@FindBy(xpath = "(//label[@class=\"btn\"])[3]")
	public WebElement newhometolivein;
	
	@FindBy(xpath = "(//div[@class=\\\"input__wrapper\\\"])[2]")
	public WebElement income;
	
	@FindBy(xpath = "(//div[@class=\\\"input__wrapper\\\"])[3]")
	public WebElement otherincome;
	
	@FindBy(xpath = "(//div[@class=\\\"input__wrapper\\\"])[6]")
	public WebElement livingexpenses;
	
	@FindBy(xpath = "(//div[@class=\\\"input__wrapper\\\"])[7]")
	public WebElement currenthomeloan;
	
	@FindBy(xpath = "(//div[@class=\\\"input__wrapper\\\"])[8]")
	public WebElement otherloan;
	
	@FindBy(xpath = "(//div[@class=\\\"input__wrapper\\\"])[9]")
	public WebElement othercommitments;
	
	@FindBy(xpath = "(//div[@class=\\\"input__wrapper\\\"])[10]")
	public WebElement totalcreditcardlimit;
	
	@FindBy(xpath = "//button[@class=\"btn btn--action btn--borrow__calculate\"]")
	public WebElement borrowbuttontocal;
	
}
