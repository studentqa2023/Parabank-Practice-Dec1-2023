@smoke
Feature: Logout testing in Parabank website
Description: User should already have created an account
Background:User should be logged in first
Scenario Outline: As a user, I want to login to Costco website using valid credentials
Given open the browser
And pass the URL "<URL>" to the homepage
When enter email "<email>" in the Email field
And enter password "<password>" in the Password field
And click on Sign In
And click on Log Out
Then validate Logout is successful
Examples:
|URL                    |email                     |password   |
|https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC|rezwan|Boston@2023|