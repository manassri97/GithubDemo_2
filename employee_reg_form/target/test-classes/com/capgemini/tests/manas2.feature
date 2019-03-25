Feature: when I go to the Employee Registration page, and filling the details,
		 after that it will redirect to the next page for Project Details.

Scenario:
	Given that I have gone to Employee_Registration_form.jsp page
	When I entered employee Num a null
	And I click on the next button
	Then Alert will be encountered