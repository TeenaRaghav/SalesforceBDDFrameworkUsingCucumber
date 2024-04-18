package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.base.BasePage;
import com.cucumber.base.BaseTest;

public class AccountsPage extends BasePage{
	static WebDriver driver;
	public AccountsPage() {
		super(driver = BaseTest.getDriver("Chrome"));
		addObject("NewButton",By.xpath("//input[@value=\" New \"]"));
		addObject("AccountName",By.xpath("//input[@id=\"acc2\"]"));
		addObject("Type",By.id("acc6"));
		addObject("Priority",By.xpath("//select[@id=\"00Nak0000011psl\"]"));
		addObject("Save",By.xpath("(//input[@name=\"save\"])[1]"));
		addObject("NewViewLink",By.xpath("//a[contains(text(),'Create New View')]"));
		addObject("ViewName",By.xpath("//input[@id=\"fname\"]"));
		addObject("ViewUniqueName",By.xpath("//input[@id=\"devname\"]"));
		addObject("SaveButtonNewViewlink",By.xpath("//input[@name=\"save\"]"));
		addObject("ViewDropDown",By.xpath("//select[@name='fcf']"));
		addObject("Edit",By.xpath("//a[contains(text(),'Edit')]"));
		addObject("Field",By.xpath("//select[@id=\"fcol1\"]"));
		addObject("Operator",By.xpath("//select[@id=\"fop1\"]"));
		addObject("Value",By.xpath("//input[@id=\"fval1\"]"));
		addObject("AvailableFields",By.xpath("//select[@id=\"colselector_select_0\"]"));
		addObject("Add",By.xpath("//img[@class=\"rightArrowIcon\"]"));
		addObject("SaveButtonInEditViewPage",By.xpath("//input[@value=\" Save \"]"));
		addObject("MergeAccount",By.xpath("//a[contains(text(),'Merge Accounts')]"));
		addObject("SearchAccount",By.xpath("//input[@id=\"srch\"]"));
		addObject("FindAccount",By.xpath("//input[@value=\"Find Accounts\"]"));
		addObject("Checkbox1",By.xpath("//input[@id='cid0']"));
		addObject("Checkbox2",By.xpath("//input[@id='cid1']"));
//		addObject("AccountCheckbox",By.id("cid2"));
		addObject("MergeAccntNext",By.xpath("//input[@title=\"Next\"]"));
		addObject("Merge",By.xpath("//input[@value=\" Merge \"]"));
		addObject("LastActivityLink",By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
		addObject("DateFieldDropdown",By.xpath("//input[@id=\"ext-gen20\"]"));
		addObject("CreatedDateField",By.xpath("//div[contains(text(),'Created Date')]"));
		addObject("DateInFromField",By.xpath("//img[@id=\"ext-gen152\"]"));
		addObject("TodaysDateInFromField",By.xpath("//span[contains(text(),'24')]"));
		addObject("DateIntoField",By.id("ext-gen154"));
		addObject("TodaysDateIntoField",By.xpath("(//button[contains(text(),'Today')])[2]"));
		addObject("SaveBtnInCreateReportpage",By.xpath("//button[@id=\"ext-gen49\"]"));
		addObject("ReportNameTextBox",By.xpath("//input[@id=\"saveReportDlg_reportNameField\"]"));
		addObject("ReportUniqueNameTextBox",By.xpath("//input[@id=\"saveReportDlg_DeveloperName\"]"));
		addObject("SaveAndRun",By.xpath("//table[@id=\"dlgSaveAndRun\"]/tbody/tr[2]/td[2]"));

	}

}
