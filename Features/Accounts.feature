Feature: Create an account
Background: Launch the application and login
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"

@test
Scenario: Edit Account
Then Click on the button "AccountsTab"
Given User is on "AccountsPage"
Then Click on the button "NewButton"
Then User Enter into text box "AccountName" "TISCO & CO"
Then User selects by value "Type" "Technology Partner"
Then User selects by value "Priority" "High"
Then Click on the button "Save"





