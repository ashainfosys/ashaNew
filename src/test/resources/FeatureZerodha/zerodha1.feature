Feature: To test login functionality of Zerodha 
Scenario Outline: To verify login successfully with valid tset data
Given Broswer is open on chrome
And User is on login page
When User enter UN and PWD
And User click on login button
Then User enter  PIN No
And User click on Continue button
Then User navigate to Home page