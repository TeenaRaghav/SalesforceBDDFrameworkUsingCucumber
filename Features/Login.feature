Feature: Login scenario

Scenario: Login with valid Username and password
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Given User is on "HomePage"