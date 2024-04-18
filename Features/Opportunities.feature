Feature: Opportunities scenarios
Background: Launch the application and login
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"

@test
Scenario: TestCase16 Opportunity dropdown 
Then Click on the button "OpportunitiesTab"
Then User is on "OpportunityPage"
Then user waits for Element "OpportunityTabdropdown"
Then Click on the button "OpportunityTabdropdown"
Then User waits to load page

