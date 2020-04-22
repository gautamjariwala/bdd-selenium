@regression
Feature: TRP Homepage API Returns HTML
  Verify all the API methods
	
  Scenario: Get method works and returns correct status code
    Given I set API endpoint as "http://restapi.demoqa.com/utilities/weather/city"
     When I add "/Hyderabad" resource to end point and submit the request
     Then I receive 200 status code
#      And Content-Type as "application/JSON" in the response
#
#      
# @tag2
# Scenario Outline: Title of your scenario outline
#   Given I want to write a step with <name>
#   When I check for the <value> in step
#   Then I verify the <status> in step
#
#   Examples: 
#    | name  | value | status  |
#   | name1 |     5 | success |
#  | name2 |     7 | Fail    |
