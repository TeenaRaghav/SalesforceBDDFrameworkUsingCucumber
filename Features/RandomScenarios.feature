Feature: Random Scenarios 
Background: Launch the application and login
Given User launch the application in "Chrome"
Given User is on "LoginPage"
Then user waits for Element "Username"
Then User Enter into text box "Username" "teena@raghav.com"
Then User Enter into text box "Password" "pritishtina@1"
Then Click on the button "Login"
Then User is on "HomePage"


Scenario: TestCase34 Verify if the firstname and lastname of the loggedin user is displayed
Then Click on the button "HomeTab"
Then User validates Username on Page "UsernameLink" "https://pcs4-dev-ed.develop.my.salesforce.com/home/home.jsp" "Teena Raghav" 
Then Click on the button "FirstAndLastNameLink"
Then User is on "UsermenuPage"
Then User waits to load page
Then User validates names on pages "UserNameOnProfilePage" "Teena Raghav" 
Then Click on the button "Usermenu"
Then User compare names "Teena Raghav"

@test
Scenario: TestCase35 Verify if the firstname and lastname at various places
Then Click on the button "HomeTab"
Then Click on the button "FirstAndLastNameLink"
Then User is on "UsermenuPage"
Then Click on the button "Edit"
When User switches to the frame "AboutFrame"
And Click on the button "AboutTab"
Then User Enter into text box "LastName" "Abcd"
And Click on the button "SaveAll"

