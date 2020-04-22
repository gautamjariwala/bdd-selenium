@smoke
Feature: Verify all the Flipkart log in scenarios
Scenario: Happy Path User Log in Scenario
Given I am on Flipkart Homepage
When I click on LOGIN button
And Enter username and password and click log in
Then I am logged in