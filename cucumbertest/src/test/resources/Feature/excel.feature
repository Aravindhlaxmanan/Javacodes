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
Feature: Title of your feature
 

  @Excel
 Scenario: Try new Login and perform actions with excel data

    Given I want to login firefox driver using exceldata
    Given I open orangehrm website  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" using exceldata
   When I login with using exceldata new
   
    
    
