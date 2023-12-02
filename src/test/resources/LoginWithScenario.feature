Feature: Login testing in Costco website
Description: User should already have created an account
Background:
Scenario: As a user, I want to login to Costco website using valid credentials
Given open the browser
And pass the URL to the homepage
|https://www.costco.com/|
When click on Sign In on the homepage
And enter email in the Email field
|rezwanislam@rocketmail.com|
And enter password in the Password field
|Boston@2023|
And click on Sign In
Then validate sign in is successful