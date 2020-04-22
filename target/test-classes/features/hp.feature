@regression
Feature: Calculator

  #Background given statement runs before every scenario
  Background: 
    Given I have a calculator

  Scenario: Adding Two Numbers
    #Given I have a calculator
    When I add 1 and 2
    Then I should get 3

 