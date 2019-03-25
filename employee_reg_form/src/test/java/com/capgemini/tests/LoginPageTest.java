package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import employee_reg_form.TestBase;
import pages.MainPage;

public class LoginPageTest extends TestBase{
	static MainPage mainPage;
	Alert a; 
	static {
		initialization();
	}
	
	@Given("^that I have gone to Employee_Registration_form\\.jsp page$")
	public void that_I_have_gone_to_Employee_Registration_form_jsp_page() throws Throwable {
		//initialization();
		mainPage = new MainPage();
		Thread.sleep(2000);
	}

	@When("^I entered employee Num \"(.*?)\"$")
	public void i_entered_employee_Num(String arg1) throws Throwable {
		Thread.sleep(2000);
	   mainPage.setEmployeeno(arg1);
	}

	@When("^I entered employee Name \"(.*?)\"$")
	public void i_entered_employee_Name(String arg2) throws Throwable {
		Thread.sleep(2000);
		mainPage.setEmployeename(arg2);
	}

	@When("^I selected the state \"(.*?)\"$")
	public void i_selected_the_state(String arg3) throws Throwable {
		Thread.sleep(2000);
		mainPage.setState(arg3);
	}

	@When("^I selected the City \"(.*?)\"$")
	public void i_selected_the_City(String arg4) throws Throwable {
		Thread.sleep(2000);
		mainPage.setCity(arg4);
	}

	@When("^I click on the next link$")
	public void i_click_on_the_next_link() throws Throwable {
		Thread.sleep(2000);
		mainPage.setButton();
	}

	@Then("^It will redirect to the Project\\.jsp file and title is \"(.*?)\"$")
	public void it_will_redirect_to_the_Project_jsp_file_and_title_is(String arg1) throws Throwable {
		
		String title = mainPage.getTitle();
		assertEquals("matched", title, "SecondPage");
		
	}
	@When("^I entered employee Num a null$")
	public void i_entered_employee_Num_a_null() throws Throwable {
		Thread.sleep(2000);
		   mainPage.setEmployeeno();
	}

	@When("^I click on the next button$")
	public void i_click_on_the_next_button() throws Throwable {
		Thread.sleep(2000);
		mainPage.setButton();
	}

	@Then("^Alert will be encountered$")
	public void alert_will_be_encountered() throws Throwable {
	    Alert a = mainPage.getAlert();
	    String text = a .getText();
	    System.out.println(text);
	    a.accept();
	}


}