package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGBasics {
	
	@BeforeSuite
	public void setUp() {
	
		System.out.println("Setup system property for chrome");
		}
	
	
	@BeforeClass
	public void launchBrowser() {
	
		System.out.println("Launch Chrome Browser");
		}
	
	@BeforeMethod
	public void enterURL() {
	
		System.out.println("enter URL");
	}
	
	@BeforeTest
	public void login() {
	
		System.out.println("login method");
	}
}
