package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class ContactsPage extends BasePage {
	static WebDriver driver;
	public ContactsPage() {
		super(driver=BaseTest.getDriver("Chrome"));
		addObject("New",By.xpath("//input[@value=' New ']"));
		addObject("LastName",By.xpath("//input[@id='name_lastcon2']"));
		addObject("LookUpIcon",By.id("con4_lkwgt"));
		addObject("LookUpIconFrame",By.xpath("//frame[@id=\"resultsFrame\"]"));
		addObject("AccountNameFromLookUp",By.xpath("//a[contains(text(),'Global Media')]"));
		addObject("AccountName",By.xpath("//input[@id='con4']"));
		addObject("Save1",By.xpath("(//input[@value=\" Save \"])[1]"));
		addObject("NewView",By.xpath("//a[contains(text(),'Create New View')]"));
		addObject("NewViewName",By.xpath("//input[@id='fname']"));
		addObject("NewViewUniqueName",By.xpath("//input[@id='devname']"));
		addObject("Save",By.xpath("(//input[@class='btn primary'])[1]"));
		addObject("FilterView",By.xpath("//select[@id=\"hotlist_mode\"]"));
		addObject("ViewDropdownInContacts",By.xpath("//select[@id='fcf']"));
		addObject("SelectedOption",By.xpath("//select[@id='00Bak000004s8sz_listSelect']"));
		addObject("RecentContacts",By.xpath("//table[@class=\"list\"]/tbody/tr[2]/th/a"));
		addObject("CancelInContacts",By.xpath("(//input[@value=\"Cancel\"])[1]"));
		addObject("SaveAndNew",By.xpath("//input[@title='Save & New'][1]"));
	}
}
