#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Employee Details Manager
  I want to use this template for my feature file

  @tag1
  Scenario: Create Employee Details
    Given Employee id is 101
    And Employee name is manas
    And Employee address Line = 89, kamla nagar; city is kanpur; country is India 
    When createEmployee method is envoked
    Then save method is envoked and employee details are stored in Hash map
    
  @tag2
  Scenario: Create employee details when name is null
    Given Employee id is 101
    And Employee name is null
    And Employee address Line = 89, kamla nagar; city is kanpur; country is India
    When createEmployee is envoked
    Then save method is envoked and exception is encountered and display message that name cannot be null
    
	@tag3
  Scenario: Create employee details when id is negative
    Given Employee id is -101
    And Employee name is manas
    And Employee address Line = 89, kamla nagar; city is kanpur; country is India
    When createEmployee is envoked
    Then validate that employee id is valid or not
    Then a exception is encountered and display message that id cannot be negative
    
	@tag4
  Scenario: Create employee details when address object is null
    Given Employee id is 101
    And Employee name is manas
    And Employee address Line = 89, kamla nagar; city is kanpur; country is India
    When createEmployee is envoked
   	Then validate that address object is null or not
    Then a exception is encountered and display message that address object cannot be null
    
   @tag5
  Scenario: Create employee details when addressLine is null
    Given Employee id is 101
    And Employee name is manas
    And Employee address Line = null; city is kanpur; country is India
    When createEmployee is envoked
   	Then validate that address Line is null or not
    Then a exception is encountered and display message that address object cannot be null
  
  @tag6
  Scenario: Search employee details by name when name is null
    Given Employee name is null
    When searchByName is envoked
   	Then validate that name is present to be searched on not
    Then a exception is encountered and display message that enter name to search  
    
  @tag7
  Scenario: Search employee details by name when id is not present
    Given Employee id is null
    When searchByName is envoked
   	Then validate that id is present in database on not
    Then a exception is encountered and display message that entered employee doesnot exist
       
  @tag8
  Scenario: Search employee details by name when name is manas
    Given Employee name is manas
    When searchByName is envoked
    Then display the details of all employee having name manas