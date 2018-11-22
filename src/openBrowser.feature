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
Feature: Validate open browser Creadentiale

Background: 
Given open Browser
And navigate to Macys URL

  @Smoke
  Scenario: Go to home page with valid creadential 
		When user click on shop by department button
		And user click on men button
		And user click on jeans button
		Then user should be in mens jeans page
		And user will click on a pant
		And choose a color
		And pick a size
		Then user will add to bag
		And user will view bag & checkout
		Then again user will click on keep shopping
		And user will land on Macys home page
		

  