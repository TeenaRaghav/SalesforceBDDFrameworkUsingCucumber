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


Scenario: Testcase22 view dropdown list
Then Click on the button "LeadsTab"
Given User is on "LeadsPage"
Then user waits for Element "View"
Then Click on the button "View"
Then User waits to load page


Scenario: Testcase23 select view from dropdown
Then Click on the button "LeadsTab"
Given User is on "LeadsPage"
When User selects by visible Text "View" "Today's Leads"
Given User is on "UsermenuPage"
Then Click on the button "Usermenu"
Then Click on the button "Logout"
Given User is on "LoginPage"
Then User waits to load page
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"
Then User waits to load page
Then Click on the button "LeadsTab"
Given User is on "LeadsPage"
Then Click on the button "Go"



Scenario: Testcase24 select view from dropdown
Then Click on the button "LeadsTab"
Given User is on "LeadsPage"
When User selects by visible Text "View" "Today's Leads"
Then User validate Selected Option "TodaysLeadPageDropdown" "Today's Leads"

@test
Scenario: Testcase25 check new button on leads home
Then Click on the button "LeadsTab"
Given User is on "LeadsPage"
Then Click on the button "New"
Then User Enter into text box "LastName" "ABCD"
Then User Enter into text box "CompanyName" "ABCD"
Then Click on the button "Save"




