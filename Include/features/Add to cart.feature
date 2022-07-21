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
@AddtoCart
Feature: Add to Cart Feature

  @fromSearch
  Scenario Outline: Add to cart from search
    Given I navigate to Happyfresh homepage
    When I enters search <search>
    When I clicks Search button
    When I clicks 'Tambah' on product want to add to the cart
    Then I add the product successfully
    
  Examples: 
      | search |
      | apel |
    
  @fromCategory
  Scenario Outline: Add to cart from category
    Given I navigate to Happyfresh homepage
    When I select and clicks the categories
    When I clicks 'Tambah' on product want to add to the cart
    Then I add the product successfully
    
  @fromBestDeals
  Scenario Outline: Add to cart from best deals
    Given I navigate to Happyfresh homepage
    When I clicks 'Tambah' on product want to add to the cart in best deals
    Then I add the product successfully
