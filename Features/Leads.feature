Feature: Leads scenarios
Background: Launch the application and login
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"


Scenario: Testcase21 check leads Tab link
Then Click on the button "LeadsTab"
Given User is on "LeadsPage"

@test
Scenario: Testcase22 view dropdown list
Then Click on the button "LeadsTab"
Given User is on "LeadsPage"
Then user waits for Element "View"
Then Click on the button "View"
Then User waits to load page


