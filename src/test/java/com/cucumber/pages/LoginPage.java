package com.cucumber.pages;

import org.openqa.selenium.By;

import com.cucumber.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage() {
		addObject("Username",By.id("username"));
		addObject("Password",By.id("password"));
		addObject("Login",By.id("Login"));
		
	}
}
