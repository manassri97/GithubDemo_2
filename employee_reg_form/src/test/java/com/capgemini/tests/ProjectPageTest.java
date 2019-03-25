package com.capgemini.tests;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import employee_reg_form.TestBase;
import pages.ProjectPage;

public class ProjectPageTest extends TestBase{
	
	static ProjectPage projectPage;
	
	@Given("^that I have gone to Project\\.jsp page$")
	public void that_I_have_gone_to_Project_jsp_page() throws Throwable {
		projectPage = new ProjectPage();
		String title = projectPage.getTitle();
		assertEquals("matched", title, "SecondPage");
		Thread.sleep(2000);
	}

	@When("^I entered the Project Name \"(.*?)\"$")
	public void i_entered_the_Project_Name(String arg1) throws Throwable {
	   projectPage.setProjectName(arg1);
	   Thread.sleep(2000);
	}

	@When("^I selected the platform \"(.*?)\"$")
	public void i_selected_the_platform(String arg2) throws Throwable {
	    projectPage.setCheckBox(arg2);
	    Thread.sleep(2000);
	}

	@When("^I clicked on the registration button$")
	public void i_clicked_on_the_registration_button() throws Throwable {
	   projectPage.setButton();
	   Thread.sleep(2000);
	}

	@Then("^It will registered the Employee$")
	public void it_will_registered_the_Employee() throws Throwable {
		String title = projectPage.getTitle();
		assertEquals("matched", title, "FirstPage");
	}

}
