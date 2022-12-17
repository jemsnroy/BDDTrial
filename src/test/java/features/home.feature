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
Feature: Facebook home page features

Scenario: home page username test
		Given user is already on home page
		|email|password|
		|jemish1023@gmail.com|Sarang123@|
		When user get the user name
		Then user name should be "Jemish Roy"
		Then user gets list of webelements
		|Friends|
		|Marketplace|
		|Most recent|
		|Groups| 
		|Watch|
		|Memories|
		And number of elements should be 6
		Then user quit
		
Scenario: home page elements test
	Given user is already on home page
		
	#	Then user click on marketplace
