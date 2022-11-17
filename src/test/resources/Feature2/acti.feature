Feature: To test login functionality
Scenario Outline: Verify user loggin successfully with valid data
Given Browser gets open
And User is on login page
When user enters valid <UN> and <PWD>
And Click on login button
Then User should navigate to homepage
Examples:
|UN|PWD|
|admin|manager|



