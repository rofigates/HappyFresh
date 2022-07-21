#Author: rofigates95@gmail.com
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
@Login
Feature: Login Feature

  @Valid
  Scenario Outline: Login with valid password
    Given I navigate to Happyfresh homepage
    When I clicks on Account page
    When I clicks on Create or login in here
    Then I can see Log in or sign up page
    When I clicks on Login here
    Then I can see login screen
    When I enters email <email>
    When I enters password <password>
    When I clicks Log in button
    Then I should be able to login successfully
    
  Examples: 
      | email | password           |
      | rofigates95@gmail.com | testing123 | 
    
  @inValid
  Scenario Outline: Login with ad invalid password
    Given I navigate to Happyfresh homepage
    When I clicks on Account page
    When I clicks on Create or login in here
    Then I can see Log in or sign up page
    When I clicks on Login here
    Then I can see login screen
    When I enters email <email>
    When I enters password <password>
    When I clicks Log in button
    Then I should NOT be able to login successfully
    
   Examples: 
      | email | password           |
      | rofigates95@gmail.com | ******* | 