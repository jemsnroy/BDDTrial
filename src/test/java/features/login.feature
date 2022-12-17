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
Feature: Facebook login page features

Scenario: Login Page link test
		Given user is already on login page
		When user get the link of login page
		Then login page link should be "https://www.facebook.com/"
		Then user quit
		
Scenario: Login page element test		
		Given user is already on login page
		When user get the element of login page
		Then login page element should be displayed
		Then user quit
		
Scenario Outline: Login page create new account test
		Given user is already on login page
		When user get the create new account button
		Then user click create new account button
		Then user enter "<First name>" and "<Surname>" and "<email>" and "<New Password>"
		#Then user select date of birth
		Then user select Gender
		Then user close

Examples: 
|First name|Surname		|email							 |New Password   |
|kadhakfh  |asidnscsd |fasdkljf165@gmai.com|abcd@WJND213215|
|dslakfdjf |cschsdcjks|duhsadi159@gmail.com|abcd@WJND213215|



Scenario: Login with correct credential		
		Given user is already on login page
		Then user enter email "jemish1023@gmail.com" and "Sarang123@"
		Then user click on login button
		Then user get the title of home page
		And home page title should be "(20+) Facebook"
		Then user quit

