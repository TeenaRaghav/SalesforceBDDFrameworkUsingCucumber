Feature: Leads scenarios
Background: Launch the application and login
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"


Scenario: Testcase26 Create new contacts
Then User waits to load page
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
Then Click on the button "New"
Then User Enter into text box "LastName" "Adams"
Then User Enter into text box "AccountName" "TSN & CO"
Then Click on the button "Save1"

@test
Scenario: Testcase27 Create new view
Then Click on the button "ContactsTab"
Then User is on "ContactsPage"
Then User Click On the Link "NewView"
Then User Enter into text box "NewViewName" "Valued Costumer"
Then User Enter into text box "NewViewUniqueName" "High_valued_customer"
Then Click on the button "Save"





