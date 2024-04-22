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


Scenario: TestCase35 Verify if the firstname and lastname at various places
Then Click on the button "HomeTab"
Then Click on the button "FirstAndLastNameLink"
Then User is on "UsermenuPage"
Then Click on the button "Edit"
When User switches to the frame "AboutFrame"
And Click on the button "AboutTab"
Then User Enter into text box "LastName" "Abcd"
And Click on the button "SaveAll"


Scenario: TestCase36 costumize MyTab
Then Click on the button "PlusButton"
Then Click on the button "customizemytab"
Then Click on the button "SelectedTabsArea"
Then Click on the button "RemoveBtn"
Then Click on the button "SaveButton"

Scenario: TestCase37 Blocking an event in the calendar
Then Click on the button "HomeTab"
Then Click on the button "CurrentDateLink"
Then User Click On the Link "EightpmLink"
And User gets the parent window handle
Then Click on the button "SubjectComboIcon"
Then User switch to child window
Then Click on the button "Other"
Then User switch to parent window
Then Click on the button "EndTimeField"
Then Click on the button "NinePmFromDropdown"
Then Click on the button "Savebtn1"


@test
Scenario: TestCase38 Blocking an event in the calendar with weekly recurrence
Then Click on the button "HomeTab"
Then Click on the button "CurrentDateLink"
Then User Click On the Link "FourPmLink"
And User gets the parent window handle
Then Click on the button "SubjectComboIcon"
Then User switch to child window
Then Click on the button "Other"
Then User switch to parent window
Then Click on the button "EndTimeField"
Then Click on the button "SevenPmFromDropdown"
Then Click on the button "Recurrence"
Then Click on the button "frequency"
Then Click on the button "EndDate"
Then Click on the button "NextMonthBtn"
Then Click on the button "SelectedDate"
Then Click on the button "Savebtn1"


