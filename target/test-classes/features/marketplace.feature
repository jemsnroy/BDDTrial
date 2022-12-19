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

Feature: Facebook marketplace page features

Background: 
	Given user is already on marketplace page
	|email|password|
	|jemish1023@gmail.com|Sarang123@|



Scenario: marketplace page header test
	Given user is on marketplace page
	When user get the header 
	Then the header should be "Marketplace"
	Then user quit

Scenario: marketplace page suggestion list test
	Given user is on marketplace page
	When user get the search box
	Then user enter "Car"
	Then user get the suggestion list
	|cars for sale|
	|cars|
	|car|
	|caravan|
	|cars for sale by owner|
	And number of suggestion should be 5
	Then user take the screenshot
	Then user quit 
